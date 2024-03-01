package com.example.q3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.q3.model.Product;
import com.example.q3.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo obj;
    public Product postStudent(Product student)
    {
        return obj.save(student);
    }
    public List<Product> Paging(int pageNo,int pageSize)
    {
        Pageable page=PageRequest.of(pageNo,pageSize);
        return obj.findAll(page).getContent();
    }
    public List<Product>  PagingAndSorting(int pageNumber,int pageSize,String field)
    {
        Pageable page=PageRequest.of(pageNumber, pageSize,Sort.by(Sort.Direction.ASC,field));
        return obj.findAll(page).getContent();
    }
    public Optional<Product> findById(int productId) {
        // TODO Auto-generated method stub
               return obj.findById(productId);
    }
}
