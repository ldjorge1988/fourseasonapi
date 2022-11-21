package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.saleProduct.ApplicationSaveSaleProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sale")
public class SaleProductController {

    private final ApplicationSaveSaleProductService saveSaleProductService;

    @PostMapping("/product")
    public ResponseEntity<Void> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        saveSaleProductService.execute(productDTO);
        return ResponseEntity.accepted().build();
    }

}
