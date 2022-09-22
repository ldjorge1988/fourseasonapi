package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.UserDTO;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ApplicationUserMapper extends ApplicationEntityMapper<UserDTO, User> {
}
