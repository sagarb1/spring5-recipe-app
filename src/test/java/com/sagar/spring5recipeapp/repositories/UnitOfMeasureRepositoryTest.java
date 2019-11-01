package com.sagar.spring5recipeapp.repositories;

import com.sagar.spring5recipeapp.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


/**
 * created by sagar on 16-10-2019
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest {
    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;
@Before
public void setUp() {

}
    @Test

    public void findByDescription() {
        Optional<UnitOfMeasure> umOptional=unitOfMeasureRepository.findByDescription("Tablespoon");
        assertEquals("Tablespoon",umOptional.get().getDescription());
    }
    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> umOptional=unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup",umOptional.get().getDescription());
    }
}