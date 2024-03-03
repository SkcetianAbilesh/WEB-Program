package com.example.d11ex2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11ex2.model.StudentId;

public interface StudentIdRepo extends JpaRepository<StudentId,Integer> {
    
}
