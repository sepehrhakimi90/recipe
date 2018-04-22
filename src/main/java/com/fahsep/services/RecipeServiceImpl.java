package com.fahsep.services;

import com.fahsep.domain.Recipe;
import com.fahsep.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> recipes() {
        log.debug("I am in service");
        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }
}

