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
//@RequiredArgsConstructor
public class SeasonDTO implements Serializable {
    private Long id;
    private String name;
    private int category;
}
