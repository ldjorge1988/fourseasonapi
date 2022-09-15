package com.fourseasons.edu.uco.fourseasonsapi.application.mapper;

import java.util.List;

public interface ApplicationEntityMapper<Dto, Domain> {
    Domain toDomain(Dto dto);

    Dto toDto(Domain domain);

    List<Domain> toDomain(List<Dto> dtoList);

    List<Dto> toDto(List<Domain> domainList);
}
