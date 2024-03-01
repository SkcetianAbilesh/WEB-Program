package com.example.q3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q3.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
