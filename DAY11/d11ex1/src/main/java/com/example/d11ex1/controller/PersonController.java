package com.example.d11ex1.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d11ex1.model.Person;
import com.example.d11ex1.service.PersonService;

@RestController
public class PersonController {
    @Autowired 
    PersonService personService;

    @PostMapping("/add")
    public Person add(@RequestBody Person person)
    {
         return  personService.add(person);
    }

    @GetMapping("/get")
    public List<Person> get()
    {
        return personService.get();
    }
    

    @GetMapping("/get/{id}")
    public Optional<Person> get(@PathVariable int id)
    {
        return personService.id(id);
    }
    
}
