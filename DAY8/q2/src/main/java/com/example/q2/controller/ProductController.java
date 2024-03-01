package com.example.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Product;
import com.example.q2.service.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProductController {
    @Autowired
    ProductService obj;
    @PostMapping("/product")
    public ResponseEntity<Product> postMethodName(@RequestBody Product entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postProduct(entity),HttpStatus.CREATED);
    }
    @GetMapping("/product/distinct/startwith/{name}")
    public ResponseEntity<List<Product>> getMethodName1(@PathVariable String name) {
        return new ResponseEntity<>(obj.getProductByStarting(name),HttpStatus.OK);
    }

    @GetMapping("/product/sortBy/price")
    public ResponseEntity<List<Product>> getMethodName2() {
        return new ResponseEntity<>(obj.getProductSortedByPrice(),HttpStatus.OK);
    }
    @GetMapping("/product/distinct/endwith/{name}")
    public ResponseEntity<List<Product>> getMethodName(@PathVariable String name) {
        return new ResponseEntity<>(obj.getProductsByEnding(name),HttpStatus.OK);
    }
    
    
    
    
}
