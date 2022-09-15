package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;

import java.util.List;

public interface ProductRepository {

    Product getById();
    Product findByName(String name);
    List<Product> getAll();

    List<Product> getAllByPrice();

    Product save(Product product);

    boolean exist(Product product);

    Long delete(Product product);
}
