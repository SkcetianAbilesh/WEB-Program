package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer>{

    

    
}
