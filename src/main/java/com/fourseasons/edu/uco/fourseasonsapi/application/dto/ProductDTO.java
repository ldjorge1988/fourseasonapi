package com.fourseasons.edu.uco.fourseasonsapi.application.dto;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private double price;
    private int discountType;
    private String image;
    private int category;
    private int quantity;
}
