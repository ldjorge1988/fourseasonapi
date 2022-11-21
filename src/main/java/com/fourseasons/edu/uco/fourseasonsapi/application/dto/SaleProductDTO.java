package com.fourseasons.edu.uco.fourseasonsapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleProductDTO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int discountType;
    private String image;
    private int category;
    private int quantity;
}
