package com.example.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q2.model.Recipe;
import com.example.q2.repository.RecipeRepo;

@Service
public class RecipeService {
    @Autowired 
    RecipeRepo obj;
    public Recipe postRecipe(Recipe recipe)
    {
        return obj.save(recipe);
    }
    public List<Recipe> findRecipeByname(String name)
    {
        return obj.getRecipeByName(name);
    }
    public Recipe findById(int id)
    {
        return obj.findByRecipeId(id);
    }
}
