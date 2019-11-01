package com.sagar.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * created by sagar on 16-10-2019
 */
public class CategoryTest {
    private Category category;
    @Before
    public void setUp(){
category=new Category();
    }

    @Test
    public void getId() {
        Long idValue=4L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}