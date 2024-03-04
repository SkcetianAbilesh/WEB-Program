package com.example.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.q1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

    
}
