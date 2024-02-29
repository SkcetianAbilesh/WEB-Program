package com.example.cc2reviewonlinedeliverysystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc2reviewonlinedeliverysystem.model.User;
import com.example.cc2reviewonlinedeliverysystem.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("/get")
    public List<User> get() {
        return userService.get();
    }

    @GetMapping("/getid/{id}")
    public Optional<User> getId(@PathVariable Long id) {
        return userService.getId(id);
    }

    @PutMapping("/edit/{id}")
    public User edit(@PathVariable Long id, @RequestBody User user) {
        return userService.edit(id, user);
    }
    
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id)
    {
        return userService.delete(id);
    }
    
    @GetMapping("/getcity/{city}")
    public List<User> getMethodName(@PathVariable String city) {
        return userService.getCity(city);
    }
    
    @GetMapping("/getorder/{pgno}/{pgs}/{field}")
    public List<User> getOrder(@PathVariable int pgno,@PathVariable int pgs,@PathVariable String field) {
        return userService.getOrder(pgno,pgs,field);
    }
    
    
}
