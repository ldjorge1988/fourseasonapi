package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.service.sale.ApplicationSaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sale")
public class SaleController {
    private final ApplicationSaleService saleService;

    @GetMapping("/getid")
    public ResponseEntity<Integer> getIdNumber(){
        return ok(saleService.getIdSale());
    }

}
