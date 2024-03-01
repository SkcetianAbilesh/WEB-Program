package com.example.q2.controller;


import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Employee;
import com.example.q2.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService obj;
   @PostMapping("/api/employee")
   public ResponseEntity<Employee> postMethod(@RequestBody Employee emp)
   { 
       return new ResponseEntity<>(obj.postEmployee(emp),HttpStatus.CREATED);
   } 
   @PutMapping("/api/employee/{employeeId}")
   public ResponseEntity<Employee> putMethod(@PathVariable Long employeeId,@RequestBody Employee emp)
   {
       return new ResponseEntity<>(obj.updateEmployee(employeeId, emp),HttpStatus.OK);
   }
   @DeleteMapping("/api/employee/{employeeId}")
   public ResponseEntity<Boolean> deleteMethod(@PathVariable Long employeeId)
   {
    return new ResponseEntity<>(obj.deleteEmployee(employeeId),HttpStatus.OK);
   }
}
