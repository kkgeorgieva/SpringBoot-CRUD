package com.dxc.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Ingredient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ingredientId;
    private String name;

    //Daufault Constructor
    public Ingredient(){

    }
    //Parameterized constructor
    public Ingredient(String name){
        this.name = name;
    }

    public int getIngredientId(){
        return ingredientId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
