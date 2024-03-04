package com.example.q1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.Employee;
import com.example.q1.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @SuppressWarnings("null")
    public Employee setEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<Employee> getEmployee()
    {
        return employeeRepo.findAll();
    }

    @SuppressWarnings("null")
    public Optional<Employee> getEmployeebyId(Long id)
    {
        return employeeRepo.findById(id);
    }
}
