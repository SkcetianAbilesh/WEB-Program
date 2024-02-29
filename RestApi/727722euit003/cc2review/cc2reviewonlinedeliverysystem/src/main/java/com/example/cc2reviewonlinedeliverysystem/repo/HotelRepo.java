package com.example.cc2reviewonlinedeliverysystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cc2reviewonlinedeliverysystem.model.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer>{
    
}
