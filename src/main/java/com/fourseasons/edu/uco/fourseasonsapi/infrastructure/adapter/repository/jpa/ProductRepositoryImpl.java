package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.ProductEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastuctureProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductRepositoryJpa productRepositoryJpa;
    private final InfrastuctureProductMapper productMapper;

    @Override
    public Product getById() {
        return null;
    }

    @Override
    public List<Product> getAll() {
        List<ProductEntity> productEntities = productRepositoryJpa.findAll();
        return productMapper.entitiesToModels(productEntities);
    }

    @Override
    public List<Product> getAllByPrice() {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public boolean exist(Product product) {
        return false;
    }

    @Override
    public void delete(Product product) {

    }
}