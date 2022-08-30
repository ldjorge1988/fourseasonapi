package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity;

import javax.persistence.*;

@Entity
@Table (name="Category")
public class CategoryEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
}
