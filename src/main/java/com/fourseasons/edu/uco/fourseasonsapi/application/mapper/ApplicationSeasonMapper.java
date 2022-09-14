package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import com.fourseasons.edu.uco.fourseasonsapi.application.dto.SeasonDTO;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationSeasonMapper {

    public List<Season> dtosToDomains(List<SeasonDTO> seasonDtos) {
        List<Season> seasons = new ArrayList<>();
        seasonDtos.forEach(seasonDTO -> {
            Season season = dtoToDomain(seasonDTO);
            seasons.add(season);
        });
        return seasons;
    }

    public List<SeasonDTO> domainsToDtos(List<Season> seasons){
        List<SeasonDTO> seasonDTOS = new ArrayList<>();
        seasons.forEach(season -> {
            SeasonDTO seasonDTO = domainToDto(season);
            seasonDTOS.add(seasonDTO);
        });
        return seasonDTOS;
    }
    public Season dtoToDomain(SeasonDTO seasonDTO) {
        return Season.builder()
                .id(seasonDTO.getId())
                .name(seasonDTO.getName())
                .category(seasonDTO.getCategory())
                .build();
    }

    public SeasonDTO domainToDto(Season season) {
        return SeasonDTO.builder()
                .id(season.getId())
                .name(season.getName())
                .category(season.getCategory())
                .build();
    }
}
