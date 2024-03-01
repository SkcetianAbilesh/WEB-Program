package com.example.d4ex3jpa.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.d4ex3jpa.model.Product;
import com.example.d4ex3jpa.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public Product add(@RequestBody Product product) {
        
        return productService.add(product);
    }

    @GetMapping("/get")
    public List<Product> get() {
        return productService.get();
    }
    
    @GetMapping("/getid/{id}")
    public Optional<Product> getId(@PathVariable Integer id)
    {
        return productService.getId(id);
    }
    

    
}
