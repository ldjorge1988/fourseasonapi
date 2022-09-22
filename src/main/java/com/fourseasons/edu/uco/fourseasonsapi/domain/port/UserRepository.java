package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;

public interface UserRepository {

    User findUserByName(String name);

    User save(User user);

    boolean exist(User user);

    Long delete(User user);

}
