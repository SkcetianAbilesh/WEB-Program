package com.example.ce1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.Address;
import com.example.ce1.service.AddressService;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("/address/person/{personId}")
    public Address setMethod(@RequestBody Address address,@PathVariable Long personId)
    {
        return addressService.setAddress(address,personId);
    }
}
