package com.example.q1.controller;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.q1.model.Address;

@RestController
public class AddressController {
    @Autowired
    Address obj;
    @GetMapping("/path")
    public String getMethodName() {
        return (obj.property+" "+obj.name);
    }
    
}
