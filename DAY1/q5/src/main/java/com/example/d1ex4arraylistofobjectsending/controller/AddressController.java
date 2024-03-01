package com.example.d1ex4arraylistofobjectsending.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.d1ex4arraylistofobjectsending.module.Address;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AddressController {
    @GetMapping("/path")
    public ArrayList<Address> f1()
    {
         ArrayList<Address> d=new ArrayList<Address>();
         Address l=new Address("hei","abi");
         d.add(l);
         return d;
    }
    
}
