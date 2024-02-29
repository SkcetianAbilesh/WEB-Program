package com.example.cc1review.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc1review.model.User;
import com.example.cc1review.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
        
        return userService.addUser(user);
    }
    @GetMapping("/getuser")
    public List<User> getUser() {
        return userService.getUser();
    }
    @GetMapping("/getuser/{finduser}")
    public Optional<User> getMethodName(@PathVariable Long finduser) {
        return userService.getUserById(finduser);
    }
    
    @PutMapping("/edituser/{id}")
    public ResponseEntity<User> editUser(@PathVariable Long id, @RequestBody User user) {
        User editedUser = userService.editUser(id, user);
        return new ResponseEntity<>(editedUser, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable Long id)
    {
        return userService.deleteUser(id);
    }
    
    @GetMapping("/finduser/{useString}")
    public List<User> findUsers(@PathVariable String useString)
    {
        return userService.findByUserAddressList(useString);
    }

    @GetMapping("/location")
    public String info(@RequestParam String location)
    {
        return("Selected Location is "+location+"!!");
    }
    

    @Value("${my.product}")
    private String hj;

    @GetMapping("/getapp")
    public String show()
    {
        return ("Our App name is "+hj);
    }
}
