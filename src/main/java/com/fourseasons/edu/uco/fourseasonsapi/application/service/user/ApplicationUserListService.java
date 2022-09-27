package com.fourseasons.edu.uco.fourseasonsapi.application.service.user;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.response.GenericResponseDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationUserMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationUserListService {
    private final UserRepository repository;
    private final ApplicationUserMapper mapper;
    public GenericResponseDTO execute() {
        return GenericResponseDTO.builder()
                .data(mapper.toDtos(repository.getAll()))
                .build();
    }
}
