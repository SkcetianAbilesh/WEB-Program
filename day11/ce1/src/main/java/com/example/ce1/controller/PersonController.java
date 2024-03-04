package com.example.ce1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.Person;
import com.example.ce1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    

    @PostMapping("/person")
    public Person setMethod(@RequestBody Person person)
    {
        return personService.setPerson(person);
    }

    @GetMapping("/person")
    public List<Person> getMethod()
    {
        return personService.getPersons();
    }

    @GetMapping("/person/{personId}")
    public Optional<Person> getMethodbyId(@PathVariable Long personId)
    {
        return personService.getPersonId(personId);
    }

   
}
