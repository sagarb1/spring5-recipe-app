package com.sagar.spring5recipeapp.domain;

import javax.persistence.*;

/**
 * created by sagar on 13-10-2019
 */
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recepie recepie;
    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recepie getRecepie() {
        return recepie;
    }

    public void setRecepie(Recepie recepie) {
        this.recepie = recepie;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
