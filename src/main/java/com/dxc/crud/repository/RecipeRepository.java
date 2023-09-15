package com.dxc.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dxc.crud.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe,Integer>{
    
}
