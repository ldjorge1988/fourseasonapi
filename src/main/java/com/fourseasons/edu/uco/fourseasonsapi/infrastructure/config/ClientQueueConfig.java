package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "product.process")
public class ClientQueueConfig {

    private String exchangeName = "inventory";
    private String routingKeyName = "inventory";;
    private String queueName = "inventory";

    public String getExchangeName() {
        return exchangeName;
    }

    public String getRoutingKeyName() {
        return routingKeyName;
    }

    public void setRoutingKeyName(String routingKeyName) {
        this.routingKeyName = routingKeyName;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }


    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
}
