package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;

import java.util.List;

public interface UserRepository {

    User findUserByName(String name);
    List<User> getAll();
    User save(User user);

    boolean exist(User user);

    Long delete(User user);

}
