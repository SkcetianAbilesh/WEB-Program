package com.example.d4ex4jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d4ex4jpa.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
    
}
