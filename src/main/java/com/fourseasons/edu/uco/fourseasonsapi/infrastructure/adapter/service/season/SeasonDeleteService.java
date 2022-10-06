package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.season;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeasonDeleteService {
    private final SeasonRepository repository;

    public Long execute(Season season) {
        validateExist(season);
        return repository.delete(season);
    }

    private void validateExist(Season season) {
        if (!repository.exist(season)) {
            throw new IllegalStateException("La temporada no se encuentra registrada");
        }
    }
}
