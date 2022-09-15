package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.adapter.entity;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.DiscountType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "DiscountType")



public class DiscountTypeEntity implements Serializable {

    private static final long serialVersionUID = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private String code;


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DiscountTypeEntity that = (DiscountTypeEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }

}
