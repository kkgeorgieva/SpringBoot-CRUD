package com.dxc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dxc.crud.entity.MealCourse;

public interface MealCourseRepository extends JpaRepository<MealCourse,Integer>{
    
}
