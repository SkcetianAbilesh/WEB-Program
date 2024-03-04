package com.example.ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.Person;
import com.example.ce1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;
    @SuppressWarnings("null")
    public Person setPerson(Person person)
    {
        return personRepo.save(person); 
    }

    public List<Person> getPersons()
    {
        return personRepo.findAll();
    }

    public Optional<Person> getPersonId(long id)
    {
        return personRepo.findById(id);
    }

   


}
