package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.service.category;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategorySaveService {

    private final CategoryRepository repository;

    public Category execute(Category category) {
        validateExist(category);
        return repository.save(category);
    }

    private void validateExist(Category category) {
        if (repository.exist(category)) {
            throw new IllegalStateException("El usuario ya se encuentra registrado");
        }
    }
}
