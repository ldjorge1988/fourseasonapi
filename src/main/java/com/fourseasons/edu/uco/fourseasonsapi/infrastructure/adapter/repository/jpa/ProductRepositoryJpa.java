package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {
    ProductEntity findProductEntitiesByName(String name);
}
