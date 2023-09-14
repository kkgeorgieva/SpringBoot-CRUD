package com.dxc.crud.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.crud.entity.Ingredient;
import com.dxc.crud.repository.IngredientRepository;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;


    @Override
    public List<Ingredient> getAllIngredients() {
       return ingredientRepository.findAll();
    }

    @Override
    public Ingredient getIngredientById(int id) {
        // if it cannot be found by id return null
        return ingredientRepository.findById(id).orElse(null);
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Ingredient updateIngredient(Ingredient ingredient) {
        //same implementation as the addition of elements
        return ingredientRepository.save(ingredient);
    }

    @Override
    public String  deleteIngredient(int id) {
        ingredientRepository.deleteById(id);
         return "ingredient with id: "+ id + " has been deleted";
    }
    
}
