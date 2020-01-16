package com.sagar.spring5recipeapp.repositories;

import com.sagar.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * created by sagar on 13-10-2019
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
