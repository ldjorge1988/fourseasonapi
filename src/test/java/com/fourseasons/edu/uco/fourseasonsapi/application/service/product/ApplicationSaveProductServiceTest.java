package com.fourseasons.edu.uco.fourseasonsapi.application.service.product;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.service.product.ProductSaveService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ApplicationSaveProductServiceTest {

    @InjectMocks
    ApplicationSaveProductService saveProductService;

    @Mock
    ProductSaveService productSaveService;
    @Mock
    ApplicationProductMapper productMapper;

    @Mock
    ProductDTO productDTO;

    @Mock
    Product product;

    @Test
    void execute(){
        saveProductService.execute(productDTO);
        productSaveService.execute(product);
        verify(productMapper).toDomain(productDTO);
    }
}
