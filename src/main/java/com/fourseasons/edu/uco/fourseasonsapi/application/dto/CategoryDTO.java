package com.fourseasons.edu.uco.fourseasonsapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class CategoryDTO implements Serializable {
    private Long id;
}
