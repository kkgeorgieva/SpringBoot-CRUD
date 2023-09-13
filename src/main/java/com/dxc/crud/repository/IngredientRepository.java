package com.dxc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.crud.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
    
}
