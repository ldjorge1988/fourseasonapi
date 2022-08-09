package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.controller;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.CategoryDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.dto.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/inventory")
public class CategoryController {

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
    public ResponseEntity<List<CategoryDTO>> getAllProducts() {
        return ok(new ArrayList<>());
    }

}
