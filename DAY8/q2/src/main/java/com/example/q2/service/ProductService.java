package com.example.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.q2.model.Product;
import com.example.q2.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired 
    ProductRepo obj;
    public List<Product> getProductByStarting(String name)
    {
        return obj.findByNameStarting(name);
    }
    public List<Product> getProductsByEnding(String name)
    {
        return obj.findByNameEnding(name);
    }
    public Product postProduct(Product product)
    {
        return obj.save(product);
    }
    public List<Product> getProductSortedByPrice() {
    
    return obj.findAll(Sort.by(Sort.Direction.ASC,"price"));
    }
    
}
