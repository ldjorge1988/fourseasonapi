package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.DiscountType;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;

import java.util.List;

public interface DiscountTypeRepository {

    DiscountType getById();

    List<DiscountType> getAll();

    List<DiscountType> getAllByPrice();

    Product save (DiscountType discountType);

    boolean exist(DiscountType discountType);

    void delete(DiscountType discountType);
}
