package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.CategoryDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.service.category.CategoryListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory")
public class CategoryController {

    private final CategoryListService categoryListService;
    @GetMapping("/category/{id}")
    public ResponseEntity<CategoryDTO> findCategoryById(@RequestParam("id") Long id) {
        return ok(new CategoryDTO());
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<CategoryDTO> deleteCategoryById(@RequestParam("id") Long id) {
        return ok(new CategoryDTO());
    }

    @PostMapping("/category")
    public ResponseEntity<CategoryDTO> createCategory() {
        return ok(new CategoryDTO());
    }

    @PutMapping("/category")
    public ResponseEntity<CategoryDTO> updateCategory() {
        return ok(new CategoryDTO());
    }

    @DeleteMapping("/category")
    public ResponseEntity<CategoryDTO> deleteCategory() {
        return ok(new CategoryDTO());
    }

    @GetMapping("/categories")
    public ResponseEntity<GenericResponseDTO> getAllCategories() {
        return ok(categoryListService.execute());
    }

}
