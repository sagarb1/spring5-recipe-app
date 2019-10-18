package com.sagar.spring5recipeapp.services;

import com.sagar.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * created by sagar on 13-10-2019
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
