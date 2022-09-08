package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class InfrastructureCategoryMapper {

    public CategoryEntity modelToEntity(Category category) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(category.getId());
        categoryEntity.setName(category.getName());
        categoryEntity.setDescription(category.getDescription());
        categoryEntity.setIdProduct(category.getIdProduct());
        return categoryEntity;
    }

    public Category entityToModel(CategoryEntity categoryEntity) {
        Category category = new Category();
        category.setId(categoryEntity.getId());
        category.setName(categoryEntity.getName());
        category.setDescription(categoryEntity.getDescription());
        category.setIdProduct(categoryEntity.getIdProduct());
        return category;
    }
}
