package com.sagar.spring5recipeapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * created by sagar on 13-10-2019
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recepies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Set<Recipe> getRecepies() {
        return recepies;
    }

    public void setRecepies(Set<Recipe> recepies) {
        this.recepies = recepies;
    }

    public void setDescription(String description) {
        this.description = description;


    }
}
