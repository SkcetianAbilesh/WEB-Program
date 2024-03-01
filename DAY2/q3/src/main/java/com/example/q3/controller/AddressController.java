package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AddressController {
    @GetMapping("/get")
    public Address getMethodName() {
        Address obj=new Address("john", 22);
        return obj;
    }
    
}
