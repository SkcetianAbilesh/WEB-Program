package com.example.d11ex1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11ex1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer>{
    
}
