package com.fahsep.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * Created by esephak on 4/24/2018.
 */
public class CategoryTest {
    Category category;

    @Before
    public void setup(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
        String description = "Test String";

        category.setDescription(description);

        assertEquals(description, category.getDescription());

    }

    @Test
    public void getRecipes() throws Exception {
        Recipe recipe = new Recipe();
        category.setRecipes(new HashSet<Recipe>());
        category.getRecipes().add(recipe);
        assertEquals(1, category.getRecipes().size());
    }

}