package com.dxc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dxc.crud.entity.MealCourse;

@Repository
public interface MealCourseRepository extends JpaRepository<MealCourse,Integer>{
    
}
