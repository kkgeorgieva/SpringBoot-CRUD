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

import com.dxc.crud.entity.MealCourse;
import com.dxc.crud.service.MealCourseService;

@RestController
public class MealCourseController {

    @Autowired
    private final MealCourseService mealCourseService;

    @Autowired
    public MealCourseController(MealCourseService mealCourseService) {
        this.mealCourseService = mealCourseService;
    }

    @PostMapping("/addMealCourse")
    public MealCourse addMealCourse(@RequestBody MealCourse mealcourse){
        return mealCourseService.addMealCourse(mealcourse);
    }
      @GetMapping("/mealCourse/{id}")
    public MealCourse finMealCourse(@PathVariable int id) {
        return mealCourseService.findMealCourse(id);
    }
    @GetMapping("/mealCourses")
    public List<MealCourse> getAllMealCourses() {
        return mealCourseService.getAllMealCourses();
    }
    @PutMapping("/updateMealCourse")
    public MealCourse updatMealCourse(MealCourse mealCourse){
        return mealCourseService.updatMealCourse(mealCourse);
    }
    
    @DeleteMapping("/deleteMealCourse/{id}")
    public String deleteMealCourse(@PathVariable int id){
       return  mealCourseService.deleteMealCourse(id);
        
    
    }

}
