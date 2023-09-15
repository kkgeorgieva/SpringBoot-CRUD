package com.dxc.crud.entity;

import org.springframework.data.repository.cdi.Eager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private int id;
    @Column(name = "recipe_name")
    private String recipeName;

    @Column(name = "cook_time")
    private String cookTime;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private MealCourse mealCourse;

    @Column(name = "Instructions")
    private String instructions;

    public Recipe(){

    }

    public Recipe(String recipeName, String cookTime, MealCourse mealCourse, String instructions){
        this.recipeName = recipeName;
        this.cookTime = cookTime;
        this. mealCourse = mealCourse;
        this.instructions = instructions;
    }

    public int getId(){
        return id;
    }

    public String getRecipeName(){
        return recipeName;
    }
    public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
    }

    public String getCookTime(){
        return cookTime;
    }
    public void setCookTime(String cookTime){
        this.cookTime = cookTime;
    }
    public String getInstructions(){
        return instructions;
    }
    public void setInstructions(String instructions){
        this.instructions = instructions;
    }
    public MealCourse getMealCourse(){
        return mealCourse;
    }
    public void setMealCourse(MealCourse mealCourse){
        this. mealCourse = mealCourse;
    }
    

}
