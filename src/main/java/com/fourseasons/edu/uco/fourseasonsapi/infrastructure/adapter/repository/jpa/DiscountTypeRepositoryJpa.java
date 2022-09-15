package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.repository.jpa;

import com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity.DiscountTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountTypeRepositoryJpa  extends JpaRepository<DiscountTypeEntity, Long> {



}
