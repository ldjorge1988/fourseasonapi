package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.SeasonEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfrastructureSeasonMapper {

    public List<SeasonEntity> modelsToEntities(List<Season> seasons) {
        List<SeasonEntity> seasonEntities = new ArrayList<>();
        seasons.forEach(season -> {
            SeasonEntity seasonsEntity = modelToEntity(season);
            seasonEntities.add(seasonsEntity);
        });
        return seasonEntities;
    }

    public List<Season> entitiesToModels(List<SeasonEntity> seasonEntities) {
        List<Season> seasons = new ArrayList<>();
        seasonEntities.forEach(seasonEntity -> {
            Season season = entityToModel(seasonEntity);
            seasons.add(season);
        });
        return seasons;
    }

    public SeasonEntity modelToEntity(Season season) {
        SeasonEntity seasonEntity = new SeasonEntity();
        seasonEntity.setId(season.getId());
        seasonEntity.setName(season.getName());
        seasonEntity.setCategory(season.getCategory());
        return seasonEntity;
    }

    public Season entityToModel(SeasonEntity seasonEntity) {
        Season season = new Season();
        season.setId(seasonEntity.getId());
        season.setName(seasonEntity.getName());
        season.setCategory(seasonEntity.getCategory());
        return season;
    }

}
