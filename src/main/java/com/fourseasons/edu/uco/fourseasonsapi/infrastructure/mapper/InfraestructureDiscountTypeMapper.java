package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.DiscountType;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.DiscountTypeEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfraestructureDiscountTypeMapper {

    public List<DiscountTypeEntity> modelsToEntities(List<DiscountType> discountTypes){
        List<DiscountTypeEntity> discountTypesEntities = new ArrayList<>();
        discountTypes.forEach(discountTypesEntity -> {
            DiscountTypeEntity discountType = modelToEntity(discountTypesEntity);
            discountTypesEntities.add(discountType);
        });
        return discountTypesEntities;
    }

    public List<DiscountType> entitiesToModels(List<DiscountTypeEntity> discountTypeEntities) {
        List<DiscountType> discountTypes = new ArrayList<>();
        discountTypeEntities.forEach(discountTypeEntity -> {
            DiscountType product = entityToModel(discountTypeEntity);
            discountTypes.add(product);
        });
        return discountTypes;
    }


    public DiscountTypeEntity modelToEntity(DiscountType discountType){
        DiscountTypeEntity discountTypeEntity = new DiscountTypeEntity();
        discountTypeEntity.setId(discountType.getId());
        discountTypeEntity.setName(discountType.getName());
        discountTypeEntity.setDescription(discountType.getDescription());
        discountTypeEntity.setCode(discountType.getCode());
        return discountTypeEntity;
    }

    public DiscountType entityToModel(DiscountTypeEntity discountTypeEntity) {
        DiscountType discountType = new DiscountType();
        discountType.setId(discountTypeEntity.getId());
        discountType.setName(discountTypeEntity.getName());
        discountType.setDescription(discountTypeEntity.getDescription());
        discountType.setCode(discountTypeEntity.getCode());
        return discountType;
    }


}
