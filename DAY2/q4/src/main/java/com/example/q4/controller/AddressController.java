package com.example.q4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q4.model.Address;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AddressController {
    Date date=new Date();
    @GetMapping("/get")
    public Address getMethod()
    {
        Address obj=new Address("title1", "james", date);
        return obj;
    }
    
    
}
