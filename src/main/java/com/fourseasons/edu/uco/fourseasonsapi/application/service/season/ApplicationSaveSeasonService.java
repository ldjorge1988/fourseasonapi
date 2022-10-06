package com.fourseasons.edu.uco.fourseasonsapi.application.service.season;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.SeasonDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationSeasonMapper;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.season.SeasonSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationSaveSeasonService {

    private final SeasonSaveService seasonSaveService;
    private final ApplicationSeasonMapper seasonMapper;
    public SeasonDTO execute(SeasonDTO seasonDTO) {
        Season season = seasonSaveService.execute(seasonMapper.toDomain(seasonDTO));
        return seasonMapper.toDto(season);
    }
}
