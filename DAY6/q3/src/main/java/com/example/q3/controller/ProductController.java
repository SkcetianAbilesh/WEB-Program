package com.example.q3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Product;
import com.example.q3.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ProductController {
    @Autowired
    ProductService obj;
    @PostMapping("/api/product")
    public ResponseEntity<Product> postMethodName(@RequestBody Product entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postStudent(entity),HttpStatus.CREATED);
    }
    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<Product>> getMethodName(@PathVariable int offset,@PathVariable int pagesize) {
        return new ResponseEntity<>(obj.Paging(offset, pagesize),HttpStatus.OK);
    }
    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Product>> getMethodName(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field) {
        return new ResponseEntity<>(obj.PagingAndSorting(offset,pagesize,field),HttpStatus.OK);
    }
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Optional<Product>> getMethodName(@PathVariable int productId) {
        return new ResponseEntity<>(obj.findById(productId),HttpStatus.OK);
    }
    
    
    
    
}
