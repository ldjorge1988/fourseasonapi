package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.CategoryRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.CategoryEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastructureCategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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
        return categoryMapper.entitiesToModels(categoryEntities);
    }

    @Override
    public List<Category> getAllByName() {
        return null;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public boolean exist(Category category) {
        return false;
    }

    @Override
    public void delete(Category category) {

    }
}
