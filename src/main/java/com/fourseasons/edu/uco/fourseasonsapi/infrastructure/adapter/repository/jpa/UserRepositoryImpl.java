package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.User;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.UserRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.UserEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastructureUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl implements UserRepository {


    private final UserRepositoryJpa repository;

    private final InfrastructureUserMapper mapper;

    @Override
    public User findUserByName(String name) {
        return mapper.toDomain(repository.findUserEntityByName(name));
    }

    @Override
    public List<User> getAll() {
        List<UserEntity> userEntities = repository.findAll();
        return mapper.toDomains(userEntities);
    }

    @Override
    public User save(User user) {
        return mapper.toDomain(repository.save(mapper.toEntity(user)));
    }

    @Override
    public boolean exist(User user) {
        return !ObjectUtils.isEmpty(repository.findUserEntityByName(user.getName()));
    }

    @Override
    public Long delete(User user) {
        return null;
    }
}
