package com.example.springapp.Ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.Ce2.model.StudentIDCard;

@Repository
public interface StudentIDRepository extends JpaRepository<StudentIDCard,Long>{

    


}
