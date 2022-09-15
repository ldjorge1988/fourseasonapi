package com.fourseasons.edu.uco.fourseasonsapi.domain.service;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductSaveService {

    private final ProductRepository repository;

    public Product execute(Product product) {
        validateExist(product);
        return repository.save(product);
    }

    private void validateExist(Product product) {
        if (repository.exist(product)) {
            throw new IllegalStateException("El usuario ya se encuentra registrado");
        }
    }
}
