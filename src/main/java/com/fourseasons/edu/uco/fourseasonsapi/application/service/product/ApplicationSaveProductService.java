package com.fourseasons.edu.uco.fourseasonsapi.application.service.product;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.service.product.ProductSaveService;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.util.MessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveProductService {

    private final ProductSaveService productSaveService;
    private final ApplicationProductMapper productMapper;
    private final MessageSender<ProductDTO> messageSenderClient;
    public ProductDTO execute(ProductDTO productDTO) {
        Product product = productSaveService.execute(productMapper.toDomain(productDTO));
        messageSenderClient.execute(productDTO, productDTO.getName());
        return productMapper.toDto(product);
    }

}
