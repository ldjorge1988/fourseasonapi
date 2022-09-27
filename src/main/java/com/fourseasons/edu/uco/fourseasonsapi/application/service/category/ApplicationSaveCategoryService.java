package com.fourseasons.edu.uco.fourseasonsapi.application.service.category;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.CategoryDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationCategoryMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.category.CategorySaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveCategoryService {

    private final CategorySaveService categorySaveService;
    private final ApplicationCategoryMapper categoryMapper;
    public CategoryDTO execute(CategoryDTO categoryDTO) {
        Category category = categorySaveService.execute(categoryMapper.toDomain(categoryDTO));
        return categoryMapper.toDto(category);
    }

}
