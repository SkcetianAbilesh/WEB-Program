package com.example.d11ex2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d11ex2.model.StudentId;

@Repository
public interface StudentIdRepo extends JpaRepository<StudentId,Integer> {
    
}
