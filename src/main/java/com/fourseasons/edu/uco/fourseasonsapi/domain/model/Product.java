package com.fourseasons.edu.uco.fourseasonsapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = -2004419908750318732L;

    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private double price;
    private int discountType;
    @NotBlank
    private String image;
    private int category;
    private int quantity;
}
