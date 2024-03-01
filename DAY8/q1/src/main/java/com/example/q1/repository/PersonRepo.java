package com.example.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{
    List<Person> findByNameStartingWith(String a);
    List<Person> findByNameEndingWith(String a);
}
