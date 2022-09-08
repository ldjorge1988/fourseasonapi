package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositoryJpa extends JpaRepository<CategoryEntity,Long> {
    CategoryEntity findCategoryEntityByName(String name);
}
