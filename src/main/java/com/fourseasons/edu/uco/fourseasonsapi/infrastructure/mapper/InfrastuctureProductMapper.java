package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface InfrastuctureProductMapper extends InfrastructureEntityMapper<ProductEntity, Product>{

}
