package com.example.q3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Student;
import com.example.q3.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class StudentController {
   @Autowired 
   StudentService obj;
   @PostMapping("/student")
   public ResponseEntity<Student> postMethodName(@RequestBody Student entity) {
       //TODO: process POST request
       
       return new ResponseEntity<>(obj.postStudent(entity),HttpStatus.CREATED);
   }
   @GetMapping("/student/marksGreaterThan/{mark}")
   public ResponseEntity<List<Student>> getMethodName1(@PathVariable int mark) {
       return new ResponseEntity<>(obj.greaterThan(mark),HttpStatus.OK);
   }
   @GetMapping("/student/marksLessThan/{mark}")
   public ResponseEntity<List<Student>> getMethodName(@PathVariable int mark) {
       return new ResponseEntity<>(obj.lessThan(mark),HttpStatus.OK);
   }
   
   
    
}
