package com.dxc.crud.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class MealCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mealName;

   /*  @OneToMany(mappedBy = "mealCourse")
    private Set<Recipe> recipes;
    */

    public int getId(){
        return id;
    }
    public String getMealName(){
        return mealName;
    }
    public void setMealName(String mealName){
        this.mealName = mealName;
    }
    /* public Set<Recipe> getRecipes(){
        return recipes;
    }
    */
}
