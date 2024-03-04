package com.example.d11ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d11ex1.model.Address;
import com.example.d11ex1.repo.AddressRepo;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    @SuppressWarnings("null")
    public Address add(Address address)
    {
        return addressRepo.save(address);
    }
    public List<Address> get()
    {
        return addressRepo.findAll();
    }

}
