package com.fourseasons.edu.uco.fourseasonsapi.application.service.user;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.UserDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationUserMapper;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.user.UserFindService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ApplicationFindUserService implements UserDetailsService {

    private final UserFindService userFindService;

    private final ApplicationUserMapper mapper;

    public UserDTO findUserByName(String name) {
        return mapper.toDto(userFindService.findUserByName(name));
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserDTO userDTO = findUserByName(userName);
        return new org.springframework.security.core.userdetails.User(userDTO.getName(), userDTO.getPassword(),
                new ArrayList<>());
    }
}
