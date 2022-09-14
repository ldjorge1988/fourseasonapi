package com.fourseasons.edu.uco.fourseasonsapi.application.service;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationCategoryMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryListService {
    private final CategoryRepository repository;
    private final ApplicationCategoryMapper mapper;
    public GenericResponseDTO execute() {
        return GenericResponseDTO.builder()
                .data(mapper.domainsToDtos(repository.getAll()))
                .build();
    }
}
