package com.fourseasons.edu.uco.fourseasonsapi.application.service.category;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationCategoryMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationCategoryListService {
    private final CategoryRepository repository;
    private final ApplicationCategoryMapper mapper;
    public GenericResponseDTO execute() {
        return GenericResponseDTO.builder()
                .data(mapper.toDtos(repository.getAll()))
                .build();
    }
}
