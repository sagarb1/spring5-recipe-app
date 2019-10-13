package com.sagar.spring5recipeapp.repositories;

import com.sagar.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * created by sagar on 13-10-2019
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
