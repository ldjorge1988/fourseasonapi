package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.mapper;

import java.util.List;

public interface InfrastructureEntityMapper<Entity, Domain> {
    Entity toEntity(Domain domain);

    Domain toDomain(Entity entity);

    List<Domain> toDomains(List<Entity> entityList);

    List<Entity> toEntities(List<Domain> domainList);
}
