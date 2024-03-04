package com.example.d11ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d11ex1.model.Address;
import com.example.d11ex1.service.AddressService;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    
    @PostMapping("/addad")
    public Address add(@RequestBody Address address)
    {
        return addressService.add(address);
    }

    @GetMapping("/getad")
    public List<Address> get()
    {
        return addressService.get();
    }

}
