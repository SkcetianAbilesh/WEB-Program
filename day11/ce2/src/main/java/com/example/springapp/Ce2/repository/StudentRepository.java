package com.example.springapp.Ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Ce2.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>
{
    
}