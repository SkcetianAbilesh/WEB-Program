package com.example.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.q2.model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe,Integer>{
    @Query("select u from Recipe u where u.recipeName=?1")
    List<Recipe> getRecipeByName(String name);
    @Query("select u from Recipe u where u.recipeId=?1")
    Recipe findByRecipeId(int id);
}
