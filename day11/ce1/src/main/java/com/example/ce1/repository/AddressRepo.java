package com.example.ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.ce1.model.Address;

import jakarta.transaction.Transactional;


public interface AddressRepo extends JpaRepository<Address,Long>{

    @Modifying
    @Transactional
    @Query(value = "insert into address(street,city,zipcode,person_id) values(?1,?2,?3,?4)",nativeQuery = true)
    void setBypersonid(String street,String city,String zipcode,Long id);
}