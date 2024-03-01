package com.example.d4ex3jpa.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.d4ex3jpa.model.Product;
import com.example.d4ex3jpa.repo.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    
    public Product add(Product product)
    {
        return productRepo.save(product);
    }

    public List<Product> get()
    {
        return productRepo.findAll();
    }

    public Optional<Product> getId(int id)
    {
        return productRepo.findById(id);
    }

}
