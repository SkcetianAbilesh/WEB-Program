package com.example.ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ce1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{

    
}
