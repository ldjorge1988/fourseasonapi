package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.SeasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepositoryJpa extends JpaRepository<SeasonEntity, Long> {
    SeasonEntity findSeasonEntitiesByName(String name);
}
