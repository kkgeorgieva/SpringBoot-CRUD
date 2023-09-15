package com.dxc.crud.entity;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "meal_course")
public class MealCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int id;
    @Column(name = "course_name")
    private String mealName;

    @OneToMany(mappedBy = "mealCourse")
    private Set<Recipe> recipes;
    

    //Default constructor 
    public MealCourse(){

    }
    //Constructor with name
    public MealCourse(String mealName){
        this.mealName = mealName;
    }
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
