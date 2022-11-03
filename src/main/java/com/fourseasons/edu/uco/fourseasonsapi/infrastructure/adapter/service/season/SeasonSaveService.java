package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.service.season;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Product;
import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.ProductRepository;
import com.fourseasons.edu.uco.fourseasonsapi.domain.port.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeasonSaveService {

    private final SeasonRepository repository;

    public Season execute(Season season) {
        validateExist(season);
        return repository.save(season);
    }

    private void validateExist(Season season) {
        if (repository.exist(season)) {
            throw new IllegalStateException("La temporada ya se encuentra registrada");
        }
    }
}
