package com.example.q1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Long>{
    
}
