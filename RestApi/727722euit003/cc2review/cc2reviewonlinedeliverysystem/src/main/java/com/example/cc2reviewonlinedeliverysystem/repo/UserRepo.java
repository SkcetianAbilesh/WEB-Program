package com.example.cc2reviewonlinedeliverysystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cc2reviewonlinedeliverysystem.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    List<User> findByUserCity(String userCity);
}
