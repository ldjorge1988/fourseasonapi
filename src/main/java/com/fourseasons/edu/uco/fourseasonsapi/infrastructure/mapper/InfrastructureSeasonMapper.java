package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.SeasonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface InfrastructureSeasonMapper extends InfrastructureEntityMapper<SeasonEntity, Season>{

}
