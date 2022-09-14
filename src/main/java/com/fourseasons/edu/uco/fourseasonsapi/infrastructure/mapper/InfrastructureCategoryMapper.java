package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.CategoryEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfrastructureCategoryMapper {

    public List<CategoryEntity> modelsToEntities(List<Category> categories) {
        List<CategoryEntity> categoryEntities = new ArrayList<>();
        categories.forEach(category -> {
            CategoryEntity categoryEntity = modelToEntity(category);
            categoryEntities.add(categoryEntity);
        });
        return categoryEntities;
    }

    public List<Category> entitiesToModels(List<CategoryEntity> categoryEntities) {
        List<Category> categories = new ArrayList<>();
        categoryEntities.forEach(categoryEntity -> {
            Category category = entityToModel(categoryEntity);
            categories.add(category);
        });
        return categories;
    }

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
