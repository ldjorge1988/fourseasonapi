package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.product;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDeleteService {
    private final ProductRepository repository;

    public Long execute(Product product) {
        validateExist(product);
        return repository.delete(product);
    }

    private void validateExist(Product product) {
        if (!repository.exist(product)) {
            throw new IllegalStateException("El usuario no se encuentra registrado");
        }
    }
}
