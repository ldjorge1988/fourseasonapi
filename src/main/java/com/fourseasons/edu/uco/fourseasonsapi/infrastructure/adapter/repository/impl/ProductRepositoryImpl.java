package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.impl;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.ProductEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa.ProductRepositoryJpa;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastuctureProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

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
    public Product findByName(String name) {
        return productMapper.toDomain(productRepositoryJpa.findProductEntitiesByName(name));
    }

    @Override
    public List<Product> getAll() {
        List<ProductEntity> productEntities = productRepositoryJpa.findAll();
        return productMapper.toDomains(productEntities);
    }

    @Override
    public List<Product> getAllByPrice() {
        return null;
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toEntity(product);
        return productMapper.toDomain(productRepositoryJpa.save(productEntity));
    }

    @Override
    public boolean exist(Product product) {
        return !ObjectUtils.isEmpty(productRepositoryJpa.findProductEntitiesByName(product.getName()));
    }

    @Override
    public Long delete(Product product) {
        return 0L;
    }
}
