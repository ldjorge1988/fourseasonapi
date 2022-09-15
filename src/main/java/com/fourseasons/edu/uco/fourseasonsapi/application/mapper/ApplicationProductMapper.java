package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ApplicationProductMapper extends ApplicationEntityMapper<ProductDTO, Product> {

}
