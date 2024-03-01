package com.example.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.q1.model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person,Integer>{
    @Modifying
    @Query(value="insert into person (age,first_name,gender,last_name,person_id) values (?,?,?,?,?)",nativeQuery = true)
    void postPerson(int age,String firstName,String lastName,String gender);

    @Query("select u from Person u")
    List<Person> getUsers();

    @Query("select u from Person u where u.age=?1")
    List<Person> getPersonByAge(int age);
}
