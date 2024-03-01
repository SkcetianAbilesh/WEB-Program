package com.example.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q1.model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{
    @Query("select u from Person u where u.age=?1")
    List<Person> findByAge(int age);
}
