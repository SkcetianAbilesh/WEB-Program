package com.example.q1.service;

import java.util.Collections;
import java.util.List;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.q1.model.Person;
import com.example.q1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo obj;
    public void postUser(Person person)
    {
       obj.save(person);
    }

    public List<Person> getPersons()
    {
        if(obj.count()==0)
        {
            return Collections.emptyList();
        }
        return obj.getUsers();
    }

    public List<Person> getPersonByAge(int age)
    {
        if(obj.count()==0)
        {
            return Collections.emptyList();
        }
        return obj.getPersonByAge(age);
    }
    
}
