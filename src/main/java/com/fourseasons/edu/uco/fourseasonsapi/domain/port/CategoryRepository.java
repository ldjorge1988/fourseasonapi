package com.fourseasons.edu.uco.fourseasonsapi.domain.port;

import com.fourseasons.edu.uco.fourseasonsapi.domain.model.Category;

import java.util.List;

public interface CategoryRepository {
    Category getById();
    List<Category> getAll();

    List<Category> getAllByName();

    Category save(Category category);

    boolean exist(Category category);

    void delete(Category category);
}
