package com.example.q1.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.Person;
import com.example.q1.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PersonController {
   @Autowired
   PersonService obj;
   @PostMapping("/person")
   public ResponseEntity<Person> postMethodName(@RequestBody Person entity) {
       //TODO: process POST request
       
       return new ResponseEntity<>(obj.postPerson(entity),HttpStatus.CREATED);
       
   }
   @GetMapping("/person/startsWithName/{value}")
   public ResponseEntity<List<Person>> getMethodName1(@PathVariable String value) {
       return new ResponseEntity<>(obj.getByNameStartingWith(value),HttpStatus.OK);
   }
   @GetMapping("/person/endsWithName/{value}")
   public ResponseEntity<List<Person>> getMethodName2(@PathVariable String value) {
       return new ResponseEntity<>(obj.getByNameEndingWith(value),HttpStatus.OK);
   }
   
   
    
}
