package com.fourseasons.edu.uco.fourseasonsapi.application.service.season;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.SeasonDTO;
import com.fourseasons.edu.uco.fourseasonsapi.application.mapper.ApplicationSeasonMapper;
import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.season.SeasonDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationDeleteSeasonService {

    private final SeasonDeleteService seasonDeleteService;

    private final ApplicationSeasonMapper seasonMapper;

    public Long execute(SeasonDTO seasonDTO) {
        return seasonDeleteService.execute(seasonMapper.toDomain(seasonDTO));
    }
}
