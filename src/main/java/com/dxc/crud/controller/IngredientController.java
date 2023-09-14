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

import com.dxc.crud.entity.Ingredient;
import com.dxc.crud.service.IngredientService;

@RestController
public class IngredientController {
    
    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/ingredient/{id}")
    public Ingredient getIngredientById(@PathVariable int id){
        return ingredientService.getIngredientById(id);
    }

    @PostMapping("/addIngredient")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient){
       return  ingredientService.addIngredient(ingredient);
    }

    @PutMapping("/updateIngredient")
    public void updateIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.updateIngredient(ingredient);
    }

    @DeleteMapping("/deleteIngredient/{id}")
    public void deleteIngredient(@PathVariable int id) {
        ingredientService.deleteIngredient(id);
    }
}
