package com.dxc.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.crud.entity.MealCourse;
import com.dxc.crud.repository.MealCourseRepository;

@Service
public class MealCourseService {
    private final MealCourseRepository mealCourseRepository;

    @Autowired
    public MealCourseService(MealCourseRepository mealCourseRepository){
        this.mealCourseRepository = mealCourseRepository;
    }
   public MealCourse addMealCourse(MealCourse mealCourse){
    return mealCourseRepository.save(mealCourse);
   }

   public MealCourse findMealCourse(int id){
    return mealCourseRepository.findById(id).orElse(null);
   }
   public List<MealCourse> getAllMealCourses(){
    return mealCourseRepository.findAll();
   } 
   public String deleteMealCourse(int id){
    mealCourseRepository.deleteById(id);
    return "Meal course with id: " + id + " has been deleted";
   }
   public MealCourse updatMealCourse(MealCourse mealCourse){
    return mealCourseRepository.save(mealCourse);
   }
}
