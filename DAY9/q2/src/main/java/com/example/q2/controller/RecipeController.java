package com.example.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Recipe;
import com.example.q2.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class RecipeController {
    @Autowired
    RecipeService obj;
    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<Recipe>> getMethodName(@RequestParam String recipeName) {
        return new ResponseEntity<>(obj.findRecipeByname(recipeName),HttpStatus.OK);
    }
    @PostMapping("/api/recipe")
    public ResponseEntity<Recipe> postMethodName(@RequestBody Recipe entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postRecipe(entity),HttpStatus.CREATED);
    }
    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<Recipe> getMethodName(@PathVariable int recipeId) {
        return new ResponseEntity<>(obj.findById(recipeId),HttpStatus.OK);
    }
    
    
}
