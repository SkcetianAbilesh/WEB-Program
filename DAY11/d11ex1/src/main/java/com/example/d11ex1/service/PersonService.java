package com.example.d11ex1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d11ex1.model.Person;
import com.example.d11ex1.repo.PersonRepo;

@Service
public class PersonService {
    @Autowired 
    PersonRepo personRepo;

    @SuppressWarnings("null")
    public Person add(Person person)
    {
        return personRepo.save(person);
    }

    public List<Person> get()
    {
        return personRepo.findAll();
    }

    public Optional<Person> id(int id)
    {
        return personRepo.findById(id);
    }

}
