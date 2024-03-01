package com.example.d4ex3jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d4ex3jpa.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
