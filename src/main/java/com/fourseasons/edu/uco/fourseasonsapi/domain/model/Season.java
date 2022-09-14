package com.fourseasons.edu.uco.fourseasonsapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Season implements Serializable {

    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private int category;
}
