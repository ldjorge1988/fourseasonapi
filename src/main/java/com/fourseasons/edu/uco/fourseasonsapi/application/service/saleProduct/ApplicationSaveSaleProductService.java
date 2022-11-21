package com.fourseasons.edu.uco.fourseasonsapi.application.service.saleProduct;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.util.MessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveSaleProductService {

    private final ApplicationProductMapper productMapper;
    private final MessageSender<ProductDTO> messageSenderClient;
    public ProductDTO execute(ProductDTO productDTO) {
        Product product = productMapper.toDomain(productDTO);
        messageSenderClient.execute(productDTO, productDTO.getName());
        return productMapper.toDto(product);
    }

}
