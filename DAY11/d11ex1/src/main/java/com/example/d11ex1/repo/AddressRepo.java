package com.example.d11ex1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11ex1.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{
    
}
