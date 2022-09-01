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
public class DiscountTypeDTO implements Serializable {
    private static final long serialVersionUID = -7689345133966755872L;
    private Long id;
    private String code;
    private String name;
    private String description;
}
