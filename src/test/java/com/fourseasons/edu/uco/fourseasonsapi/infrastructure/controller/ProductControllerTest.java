package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.product.ApplicationDeleteProductService;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.product.ApplicationProductListService;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.product.ApplicationSaveProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @Mock
    ApplicationSaveProductService saveProductService;

    @Mock
    ApplicationDeleteProductService deleteProductService;

    @Mock
    ApplicationProductListService productListService;
    @InjectMocks
    ProductController productController;

    @Mock
    ProductDTO productDTO;

    @Test
    void findAllSuccessful() {
        productController.getAllProducts();
        verify(productListService).execute();
    }

    @Test
    void saveSuccessful() {
        productController.createProduct(productDTO);
        verify(saveProductService).execute(productDTO);
    }

    @Test
    void deleteSuccessful() {
        productController.deleteProduct(productDTO);
        verify(deleteProductService).execute(productDTO);
    }
}
