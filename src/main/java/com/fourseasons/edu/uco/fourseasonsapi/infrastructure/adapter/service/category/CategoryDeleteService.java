package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.category;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryDeleteService {
    private final CategoryRepository repository;

    public Long execute(Category category) {
        validateExist(category);
        return repository.delete(category);
    }

    private void validateExist(Category category) {
        if (!repository.exist(category)) {
            throw new IllegalStateException("El usuario no se encuentra registrado");
        }
    }
}
