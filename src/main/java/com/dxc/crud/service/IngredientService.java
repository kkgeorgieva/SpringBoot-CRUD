package com.dxc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.crud.entity.Ingredient;
import com.dxc.crud.repository.IngredientRepository;

@Service
public class IngredientService {
    @Autowired
    // injecting the already created repository for ingredients
    private IngredientRepository repository;

    public Ingredient saveIngredient(Ingredient ingredient){
        return repository.save(ingredient);
    }
    public List<Ingredient> saveIngredients(List<Ingredient> ingredients){
        return repository.saveAll(ingredients);
    }

    public List<Ingredient> getIngredients(){
        return repository.findAll();
    }

    public Ingredient getIngredientById(int id){
        // if we do not get the value -> return null
        return repository.findById(id).orElse(null);
    }
     public Ingredient getIngredientByName(String name){
        // if we do not get the value -> return null
        return repository.findByName(name);
    }
    public String deleteIngredient(int id){
        repository.deleteById(id);
        return "ingredient removed -> " + id;
    }

    public Ingredient updateIngredient(Ingredient ingredient){
        Ingredient existingIngredient = repository.findById(ingredient.getIngredientId()).orElse(null);
        existingIngredient.setName(ingredient.getName());
        return repository.save(existingIngredient);
    }
}