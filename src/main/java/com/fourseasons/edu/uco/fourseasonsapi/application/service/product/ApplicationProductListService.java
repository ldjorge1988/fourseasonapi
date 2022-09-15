package com.fourseasons.edu.uco.fourseasonsapi.application.service.product;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationProductMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationProductListService {
    private final ProductRepository repository;
    private final ApplicationProductMapper mapper;
    public GenericResponseDTO execute() {
        return GenericResponseDTO.builder()
                .data(mapper.toDto(repository.getAll()))
                .build();
    }
}
