package com.fahsep.controllers;

import com.fahsep.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController{

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
        log.debug("Index Controller Object created: " + this.toString());
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("get index method called from " + this.getClass().getName());
        model.addAttribute("recipes", recipeService.recipes());
        return "index";
    }
}
