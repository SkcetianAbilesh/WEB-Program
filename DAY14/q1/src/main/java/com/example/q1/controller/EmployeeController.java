package com.example.q1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Employee;
import com.example.q1.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Tag(name = "setEmployee",description = "Initialize employee details")
    @PostMapping("/employee")
    public ResponseEntity<Employee> setMethod(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.setEmployee(employee),HttpStatus.CREATED);
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>>  getMEthod()
    {
        return new ResponseEntity<>(employeeService.getEmployee(),HttpStatus.OK);
    }
    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Optional<Employee>>  getMEthodbyId(@PathVariable Long employeeId)
    {
        return new ResponseEntity<>(employeeService.getEmployeebyId(employeeId),HttpStatus.OK);
    }
}
