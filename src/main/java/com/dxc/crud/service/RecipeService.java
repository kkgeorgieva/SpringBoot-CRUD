package com.dxc.crud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.crud.entity.Recipe;
import com.dxc.crud.repository.RecipeRepository;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public Recipe addRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }
    public Recipe  findRecipe(int id){
        return recipeRepository.findById(id).orElse(null);
    }
    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }
    public String deleteRecipe(int id){
        recipeRepository.deleteById(id);
        return "Item with id: " + id + " has been deleted";
    }
    public Recipe updateRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }
}
