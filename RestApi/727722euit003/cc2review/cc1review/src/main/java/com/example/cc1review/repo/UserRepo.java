package com.example.cc1review.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cc1review.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    List<User> findByUserAddress(String userAddress);
} 
