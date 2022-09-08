package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;

import java.util.List;

public interface ProductRepository {

    Product getById();
    List<Product> getAll();

    List<Product> getAllByPrice();

    Product save(Product product);

    boolean exist(Product product);

    void delete(Product product);
}
