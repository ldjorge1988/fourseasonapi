package com.fourseasons.edu.uco.fourseasonsapi.application.service;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationSeasonMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeasonListService {

    private final SeasonRepository repository;
    private final ApplicationSeasonMapper mapper;
    public GenericResponseDTO execute() {
        return GenericResponseDTO.builder()
                .data(mapper.domainsToDtos(repository.getAll()))
                .build();
    }
}
