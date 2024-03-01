package com.example.d1ex1intro.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String getMethodName() {
        return ("HELLO!");
    }
    
}
