package com.example.d1ex2gettinginputfromurl.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/path")
    public String getMethodName(@RequestParam String fruit) {
        return ("My favourite fruit is "+fruit+"!");
    }
    
}
