package com.dxc.crud.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.dxc.crud.entity.Ingredient;


@Service
public interface IngredientService {
    
    List<Ingredient> getAllIngredients();
    public Ingredient getIngredientById(int id);
    public Ingredient addIngredient(Ingredient ingredient);
    public Ingredient updateIngredient(Ingredient ingredient);
    public String  deleteIngredient(int id);
}