package com.example.d4ex2jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.d4ex2jpa.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job,Long>{

    
} 
