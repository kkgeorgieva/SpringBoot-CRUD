package com.dxc.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.crud.entity.Recipe;
import com.dxc.crud.service.RecipeService;

@RestController
public class RecipeController {
    
    @Autowired
    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @PostMapping("/addRecipe")
    public Recipe addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }

    @GetMapping("/findRecipe/{id}")
    public Recipe findRecipe(@PathVariable int id){
        return recipeService.findRecipe(id);
    }
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }
    @PutMapping("/updateRecipe")
    public Recipe updatRecipe(Recipe recipe){
        return recipeService.updateRecipe(recipe);
    }
    @DeleteMapping("/deleteRecipe/{id}")
    public String deleteRecipe(@PathVariable int id){
        return recipeService.deleteRecipe(id);
    }

}
