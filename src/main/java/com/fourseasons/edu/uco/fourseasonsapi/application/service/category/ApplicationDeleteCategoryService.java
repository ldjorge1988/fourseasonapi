package com.fourseasons.edu.uco.fourseasonsapi.application.service.category;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.CategoryDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationCategoryMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.service.category.CategoryDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationDeleteCategoryService {

    private final CategoryDeleteService categoryDeleteService;

    private final ApplicationCategoryMapper categoryMapper;

    public Long execute(CategoryDTO categoryDTO) {
        return categoryDeleteService.execute(categoryMapper.toDomain(categoryDTO));
    }

}
