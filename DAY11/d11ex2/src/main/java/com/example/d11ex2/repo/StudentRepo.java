package com.example.d11ex2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d11ex2.model.Student;

@Repository
public interface StudentRepo  extends JpaRepository<Student,Integer>{
    
}
