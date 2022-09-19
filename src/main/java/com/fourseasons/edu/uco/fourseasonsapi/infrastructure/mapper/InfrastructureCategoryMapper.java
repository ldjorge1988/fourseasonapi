package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.CategoryEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {})

public interface InfrastructureCategoryMapper extends InfrastructureEntityMapper<CategoryEntity, Category> {

}
