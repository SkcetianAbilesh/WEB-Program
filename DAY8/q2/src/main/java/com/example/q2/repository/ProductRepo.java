package com.example.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q2.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
@Query("select distinct u from  Product u where u.productName like ?1%")
List<Product> findByNameStarting(String name);
@Query("select distinct u from  Product u where u.productName like %?1")
List<Product> findByNameEnding(String name);

} 
