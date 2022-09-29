package com.fourseasons.edu.uco.fourseasonsapi.application.service.user;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.UserDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationUserMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.user.UserSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveUserService {
    private final ApplicationUserMapper mapper;
    private final UserSaveService service;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    public UserDTO execute(UserDTO userDTO) {
        userDTO.setPassword(bcryptEncoder.encode(userDTO.getPassword()));
        User user = service.execute(mapper.toDomain(userDTO));
        return mapper.toDto(user);
    }
}
