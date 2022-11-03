package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.stream.publisher;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.config.ClientQueueConfig;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.util.MessageSender;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.util.gson.MapperJsonObjeto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Slf4j
@Component
@RequiredArgsConstructor
public class MessageSenderBroker implements MessageSender<ProductDTO> {

    private final RabbitTemplate rabbitTemplate;

    private final MapperJsonObjeto mapperJsonObjeto;

    private final ClientQueueConfig clientQueueConfig;

    @Override
    public void execute(ProductDTO message, String idMessage) {
        log.debug("execute MessageSenderBroker");
        MessageProperties propiedadesMensaje = generarPropiedadesMensaje(idMessage);

        Optional<Message> cuerpoMensaje = obtenerCuerpoMensaje(message, propiedadesMensaje);
        if (!cuerpoMensaje.isPresent()) {
            return;
        }
        log.debug("conver and send");
        rabbitTemplate.convertAndSend(clientQueueConfig.getExchangeName(), clientQueueConfig.getRoutingKeyName(), cuerpoMensaje.get());
        log.debug("mensaje publicado queue: {} - exchange: {} - cuerpoMensaje: {}", clientQueueConfig.getQueueName(), clientQueueConfig.getExchangeName(),
                cuerpoMensaje.get());
    }

    private MessageProperties generarPropiedadesMensaje(String idMessageSender ) {
        log.debug("generar propiedades del mensaje {}", idMessageSender);
        return MessagePropertiesBuilder.newInstance()
                .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setHeader("idMensaje", idMessageSender)
                .build();
    }

    private Optional<Message> obtenerCuerpoMensaje(Object mensaje, MessageProperties propiedadesMensaje) {
        Optional<String> textoMensaje = mapperJsonObjeto.ejecutarGson(mensaje);
        log.debug("obtener cuerpo mensaje {}", textoMensaje);
        return textoMensaje.map(msg -> MessageBuilder
                .withBody(msg.getBytes())
                .andProperties(propiedadesMensaje)
                .build());

    }
}
