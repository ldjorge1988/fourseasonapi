package com.fourseasons.edu.uco.fourseasonsapi.application.service.product;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.product.ProductDeleteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ApplicationDeleteProductServiceTest {

    @InjectMocks
    ApplicationDeleteProductService deleteProductService;

    @Mock
    ApplicationProductMapper productMapper;

    @Mock
    ProductDeleteService productDeleteService;

    @Mock
    ProductDTO productDTO;

    @Mock
    Product product;

    @Test
    void execute(){
        deleteProductService.execute(productDTO);
        productDeleteService.execute(product);
        verify(productMapper).toDomain(productDTO);
    }
}
