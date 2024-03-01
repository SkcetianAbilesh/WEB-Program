package com.example.q1.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Person;
import com.example.q1.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PersonController {
    @Autowired
    PersonService obj;
    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<Person>> getMethodName(@PathVariable int age) {
        return new ResponseEntity<>(obj.getByAge(age),HttpStatus.OK);
    }
    @PostMapping("/api/person")
    public ResponseEntity<Person> postMethodName(@RequestBody Person entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postPerson(entity),HttpStatus.CREATED);
    }
    
    
}
