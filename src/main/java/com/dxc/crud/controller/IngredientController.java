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
    private IngredientService service;

    @PostMapping("/addIngredient")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient){
        return service.saveIngredient(ingredient);
    }
    @PostMapping("/addIngredients")
    public List<Ingredient> addIngredients(@RequestBody List<Ingredient> ingredients){
        return service.saveIngredients(ingredients);
    }
    @GetMapping("/ingredients")
    public List<Ingredient> findAllIngredients(){
        return service.getIngredients();
    }
    @GetMapping("/ingredient/{id}")
    public Ingredient findIngredientById(@PathVariable int id){
        return service.getIngredientById(id);
    }
     @GetMapping("/ingredient/{name}")
    public Ingredient findIngredientByName(@PathVariable String name){
        return service.getIngredientByName(name);
    }
    @PutMapping("/update")
    public Ingredient updateIngredient(@RequestBody Ingredient ingredient){
        return service.updateIngredient(ingredient);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteIngredient(@PathVariable int id){
        return service.deleteIngredient(id);
    }

}
