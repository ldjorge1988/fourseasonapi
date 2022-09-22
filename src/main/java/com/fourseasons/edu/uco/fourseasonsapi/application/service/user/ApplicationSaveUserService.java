package com.fourseasons.edu.uco.fourseasonsapi.application.service.user;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.UserDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationUserMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import com.fourseasons.edu.uco.fourseasonsapi.domain.service.user.UserSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveUserService {
    private final ApplicationUserMapper mapper;
    private final UserSaveService service;

    public UserDTO execute(UserDTO userDTO) {
        User user = service.execute(mapper.toDomain(userDTO));
        return mapper.toDto(user);
    }
}
