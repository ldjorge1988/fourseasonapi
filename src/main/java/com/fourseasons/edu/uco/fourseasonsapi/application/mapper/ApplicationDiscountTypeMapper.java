package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.DiscountTypeDTO;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.DiscountType;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationDiscountTypeMapper {

    public List<DiscountType> dtosToDomains(List<DiscountTypeDTO> discountTypeDTOS){
        List <DiscountType> discountTypes = new ArrayList<>();
        discountTypeDTOS.forEach(discountTypeDTO -> {
            DiscountType discountType = dtoToDomain(discountTypeDTO);
            discountTypes.add(discountType);
        });
        return discountTypes;
    }

    public List<DiscountTypeDTO> domainsToDtos(List<DiscountType> discountTypes){
        List<DiscountTypeDTO> discountTypeDTOS = new ArrayList<>();
        discountTypes.forEach(discountType -> {
            DiscountTypeDTO discountTypeDTO = domainToDto(discountType);
            discountTypeDTOS.add(discountTypeDTO);
        });
        return discountTypeDTOS;
    }

    public DiscountType dtoToDomain(DiscountTypeDTO discountTypeDTO){
        return DiscountType.builder()
                .id(discountTypeDTO.getId())
                .name(discountTypeDTO.getName())
                .code(discountTypeDTO.getCode())
                .description(discountTypeDTO.getDescription())
                .build();
    }

    public DiscountTypeDTO domainToDto(DiscountType discountType){
        return DiscountTypeDTO.builder()
                .id(discountType.getId())
                .name(discountType.getName())
                .code(discountType.getCode())
                .description(discountType.getDescription())
                .build();
    }
}
