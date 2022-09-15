package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;


import com.fourseasons.edu.uco.fourseasonsapi.application.dto.DiscountTypeDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.SeasonDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/discount")

public class DiscoutTypeController {
    @GetMapping("/discount/{id}")
    public ResponseEntity<GenericResponseDTO> findDiscountById(@RequestParam("id") Long id) {
        return ok(new GenericResponseDTO(new DiscountTypeDTO()));
    }

    @PostMapping("/discount")
    public ResponseEntity<DiscountTypeDTO> createDiscount() {
        return ok(new DiscountTypeDTO());
    }

    @PutMapping("/discount")
    public ResponseEntity<DiscountTypeDTO> updateDiscount() {
        return ok(new DiscountTypeDTO());
    }

    @DeleteMapping("/discounts")
    public ResponseEntity<DiscountTypeDTO> deleteAllDiscount() {
        return ok(new DiscountTypeDTO());
    }

    @GetMapping("/discounts/prices")
    public ResponseEntity<List<Double>> getDiscount() {

        return ok(new ArrayList<>());
    }


}
