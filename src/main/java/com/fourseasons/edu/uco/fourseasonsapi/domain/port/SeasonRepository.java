package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Season;

import java.util.List;

public interface SeasonRepository {

    Season getById();
    List<Season> getAll();

    Season save(Season season);

    boolean exist(Season season);

    void delete(Season season);
}
