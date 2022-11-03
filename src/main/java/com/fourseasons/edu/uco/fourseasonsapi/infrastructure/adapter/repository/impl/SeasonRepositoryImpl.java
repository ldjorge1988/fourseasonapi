package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.impl;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.SeasonRepository;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.SeasonEntity;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa.SeasonRepositoryJpa;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper.InfrastructureSeasonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

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
        return seasonMapper.toDomains(seasonEntities);
    }

    @Override
    public Season save(Season season) {
        SeasonEntity seasonEntity = seasonMapper.toEntity(season);
        return seasonMapper.toDomain(seasonRepositoryJpa.save(seasonEntity));
    }

    @Override
    public boolean exist(Season season) {
        return !ObjectUtils.isEmpty(seasonRepositoryJpa.findSeasonEntitiesByName(season.getName()));
    }

    @Override
    public Long delete(Season season) {

        return 0L;
    }
}
