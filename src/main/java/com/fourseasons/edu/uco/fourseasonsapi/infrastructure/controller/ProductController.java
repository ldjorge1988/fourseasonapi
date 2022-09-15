package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.product.ApplicationDeleteProductService;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.product.ApplicationProductListService;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.product.ApplicationSaveProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory")
public class ProductController {

    private final ApplicationProductListService productListService;
    private final ApplicationSaveProductService saveProductService;

    private final ApplicationDeleteProductService deleteProductService;
    @GetMapping("/product/{id}")
    public ResponseEntity<GenericResponseDTO> findProductById(@RequestParam("id") Long id) {
        return ok(new GenericResponseDTO(new ProductDTO()));
    }

    @GetMapping("/products")
    public ResponseEntity<GenericResponseDTO> getAllProducts() {
        return ok(productListService.execute());
    }

    @PostMapping("/product")
    public ResponseEntity<ProductDTO> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        return ok(saveProductService.execute(productDTO));
    }

    @PutMapping("/product")
    public ResponseEntity<ProductDTO> updateProduct(ProductDTO productDTO) {
        return ok(new ProductDTO());
    }

    @DeleteMapping("/product")
    public ResponseEntity<Long> deleteProduct(@Valid @RequestBody ProductDTO productDTO) {
        return ok(deleteProductService.execute(productDTO));
    }

    @GetMapping("/product/prices")
    public ResponseEntity<List<Double>> getPrices() {
        return ok(new ArrayList<>());
    }
}
