package com.fourseasons.edu.uco.fourseasonsapi.application.service.product;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.service.product.ProductDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationDeleteProductService {

    private final ProductDeleteService productDeleteService;

    private final ApplicationProductMapper productMapper;

    public Long execute(ProductDTO productDTO) {
        return productDeleteService.execute(productMapper.toDomain(productDTO));
    }

}
