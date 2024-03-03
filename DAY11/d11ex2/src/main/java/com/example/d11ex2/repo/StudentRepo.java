package com.example.d11ex2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11ex2.model.Student;

public interface StudentRepo  extends JpaRepository<Student,Integer>{
    
}
