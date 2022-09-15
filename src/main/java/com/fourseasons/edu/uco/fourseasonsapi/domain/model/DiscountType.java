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

public class DiscountType implements Serializable {

    private static final long serialVersionUID = 0;

    private Long id;
    private String code;
    @NotBlank
    private String name;
    @NotBlank
    private String description;


}
