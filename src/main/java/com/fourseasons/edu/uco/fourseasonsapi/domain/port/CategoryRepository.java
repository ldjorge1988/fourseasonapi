package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;

import java.util.List;

public interface CategoryRepository {
    Category getById();
    Category findByName(String name);
    List<Category> getAll();
    Category save(Category category);

    boolean exist(Category category);

    Long delete(Category category);
}
