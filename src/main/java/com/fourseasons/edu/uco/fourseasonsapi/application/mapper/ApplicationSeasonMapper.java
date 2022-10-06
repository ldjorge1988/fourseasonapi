package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.SeasonDTO;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ApplicationSeasonMapper extends ApplicationEntityMapper<SeasonDTO, Season> {

}
