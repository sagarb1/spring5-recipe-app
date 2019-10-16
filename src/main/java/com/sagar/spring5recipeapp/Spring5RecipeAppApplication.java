package com.sagar.spring5recipeapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class Spring5RecipeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5RecipeAppApplication.class, args);
        log.info("working");

    }

}
