package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.CategoryDTO;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationCategoryMapper {
    public List<Category> dtosToDomains(List<CategoryDTO> categoriesDtos) {
        List<Category> categories = new ArrayList<>();
        categoriesDtos.forEach(categoryDTO -> {
            Category category = dtoToDomain(categoryDTO);
            categories.add(category);
        });
        return categories;
    }

    public List<CategoryDTO> domainsToDtos(List<Category> categories){
        List<CategoryDTO> categoriesDTOS = new ArrayList<>();
        categories.forEach(category -> {
            CategoryDTO categoryDTO = domainToDto(category);
            categoriesDTOS.add(categoryDTO);
        });
        return categoriesDTOS;
    }
    public Category dtoToDomain(CategoryDTO categoryDTO) {
        return Category.builder()
                .id(categoryDTO.getId())
                .name(categoryDTO.getName())
                .description(categoryDTO.getDescription())
                .idProduct(categoryDTO.getIdProduct())
                .build();
    }

    public CategoryDTO domainToDto(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .description(category.getDescription())
                .idProduct(category.getIdProduct())
                .build();
    }
}
