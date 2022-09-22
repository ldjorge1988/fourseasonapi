package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface InfrastructureUserMapper extends InfrastructureEntityMapper<UserEntity, User> {
}
