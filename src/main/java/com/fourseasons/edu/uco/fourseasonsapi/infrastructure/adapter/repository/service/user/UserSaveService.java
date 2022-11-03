package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.service.user;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSaveService {

    private final UserRepository repository;

    public User execute(User user){
        validateExist(user);
        return repository.save(user);
    }

    private void validateExist(User user) {
        if (repository.exist(user)){
            throw new IllegalStateException("El usuario ya se encuentra registrado");
        }
    }
}
