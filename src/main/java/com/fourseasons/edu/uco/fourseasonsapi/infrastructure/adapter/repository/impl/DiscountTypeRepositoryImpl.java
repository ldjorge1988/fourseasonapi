package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.impl;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.DiscountType;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.DiscountTypeRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.DiscountTypeEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa.DiscountTypeRepositoryJpa;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfraestructureDiscountTypeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository

public class DiscountTypeRepositoryImpl implements DiscountTypeRepository {
    private final DiscountTypeRepositoryJpa discountTypeRepositoryJpa;
    private final InfraestructureDiscountTypeMapper infraestructureDiscountTypeMapper;

    @Override
    public DiscountType getById(){
        return null;
    }
    @Override
    public List<DiscountType> getAll(){
        List<DiscountTypeEntity> discountTypeEntities= discountTypeRepositoryJpa.findAll();
        return  infraestructureDiscountTypeMapper.entitiesToModels(discountTypeEntities);
    }

    @Override
    public List<DiscountType> getAllByPrice() {
        return null;
    }

    @Override
    public DiscountType save(DiscountType discountType) {
        return null;
    }


    @Override
    public boolean exist(DiscountType discountType) {
        return false;
    }

    @Override
    public void delete(DiscountType discountType) {

    }


}
