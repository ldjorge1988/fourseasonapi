package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.impl;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.CategoryRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.CategoryEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa.CategoryRepositoryJpa;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastructureCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryRepositoryJpa categoryRepositoryJpa;
    private final InfrastructureCategoryMapper categoryMapper;


    @Override
    public Category getById() {
        return null;
    }

    @Override
    public List<Category> getAll() {
        List<CategoryEntity> categoryEntities = categoryRepositoryJpa.findAll();
        return categoryMapper.toDomains(categoryEntities);
    }

    @Override
    public Category findByName(String name) {
        return categoryMapper.toDomain(categoryRepositoryJpa.findCategoryEntityByName(name));
    }


    @Override
    public Category save(Category category) {
        CategoryEntity categoryEntity = categoryMapper.toEntity(category);
        return categoryMapper.toDomain(categoryRepositoryJpa.save(categoryEntity));
    }

    @Override
    public boolean exist(Category category) {
        return !ObjectUtils.isEmpty(categoryRepositoryJpa.findCategoryEntityByName(category.getName()));
    }

    @Override
    public Long delete(Category category) {
        return 0L;
    }
}
