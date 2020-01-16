package com.sagar.spring5recipeapp.repositories;

import com.sagar.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * created by sagar on 13-10-2019
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
   Optional<UnitOfMeasure> findByDescription(String description);
}
