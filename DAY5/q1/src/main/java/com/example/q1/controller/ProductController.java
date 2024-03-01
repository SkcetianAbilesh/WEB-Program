package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Product;
import com.example.q1.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    @Autowired
    ProductService obj;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getMethodName() {
        return new ResponseEntity<>(obj.getProducts(),HttpStatus.OK);
    }
    @PostMapping("/add/product")
    public ResponseEntity<Product> postMethodName(@RequestBody Product entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postProduct(entity),HttpStatus.CREATED);
    }
    @PutMapping("path/{id}")
    public ResponseEntity<Product> putMethodName(@PathVariable int id, @RequestBody Product entity) {
        //TODO: process PUT request
        
        return new ResponseEntity<>(obj.updateProduct(id,entity),HttpStatus.OK);
    }  
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteMethod(@PathVariable int id)
    {
        return new ResponseEntity<>(obj.deleteProduct(id),HttpStatus.OK);
    }
    

    
}
