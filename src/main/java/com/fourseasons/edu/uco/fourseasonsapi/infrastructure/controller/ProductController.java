package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/inventory")
public class ProductController {

    @GetMapping("/product")
    public ResponseEntity<ProductDTO> findProductById() {
        return ok(new ProductDTO());
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return ok(new ArrayList<>());
    }

    @PostMapping("/product")
    public ResponseEntity<ProductDTO> createProduct() {
        return ok(new ProductDTO());
    }

    @PutMapping("/product")
    public ResponseEntity<ProductDTO> updateProduct() {
        return ok(new ProductDTO());
    }

    @DeleteMapping("/product")
    public ResponseEntity<ProductDTO> deleteProduct() {
        return ok(new ProductDTO());
    }

    @GetMapping("/product/prices")
    public ResponseEntity<List<Double>> getPrices() {
        return ok(new ArrayList<>());
    }
}
