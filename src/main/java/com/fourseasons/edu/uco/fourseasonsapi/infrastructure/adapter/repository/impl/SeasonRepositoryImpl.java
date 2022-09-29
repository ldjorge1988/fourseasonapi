package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.impl;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.SeasonRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.SeasonEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa.SeasonRepositoryJpa;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastructureSeasonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class SeasonRepositoryImpl implements SeasonRepository {
    private final SeasonRepositoryJpa seasonRepositoryJpa;
    private final InfrastructureSeasonMapper seasonMapper;

    @Override
    public Season getById() {
        return null;
    }

    @Override
    public List<Season> getAll() {
        List<SeasonEntity> seasonEntities = seasonRepositoryJpa.findAll();
        return seasonMapper.entitiesToModels(seasonEntities);
    }

    @Override
    public Season save(Season season) {
        return null;
    }

    @Override
    public boolean exist(Season season) {
        return false;
    }

    @Override
    public void delete(Season season) {

    }
}
