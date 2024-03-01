package com.example.q2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q2.model.Course;
import com.example.q2.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class CourseController {
    @Autowired
    CourseService obj;
    @PostMapping("/api/course")
    public ResponseEntity<Course> postMethodName(@RequestBody Course entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postCourse(entity),HttpStatus.CREATED);
    }
    @GetMapping("/api/course/a")
    public ResponseEntity<List<Course>> getMethodName1() {
        return new ResponseEntity<>(obj.getCourse(),HttpStatus.OK);
    }
    @GetMapping("/api/course/b")
    public ResponseEntity<List<Course>> getMethodName2(@RequestParam String param) {
        return new ResponseEntity<>(obj.getCourseByName(param),HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
    
}
