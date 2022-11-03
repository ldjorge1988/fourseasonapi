package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.service.user;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserFindService {

    private final UserRepository userRepository;

    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }
}
