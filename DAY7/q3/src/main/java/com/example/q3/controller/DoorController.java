package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Door;
import com.example.q3.service.DoorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DoorController {
    @Autowired
    DoorService obj;
    @PostMapping("/api/door")
    public ResponseEntity<?> postMethodName(@RequestBody Door entity) {
        //TODO: process POST request
        
        return new ResponseEntity<>(obj.postDoor(entity),HttpStatus.CREATED);
    }
    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> getMethodName() {
        return new ResponseEntity<>(obj.getDoors(),HttpStatus.OK);
    }
    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<Optional<Door>> getMethodName(@PathVariable int param) {
        return new ResponseEntity<>(obj.getDoorById(param),HttpStatus.OK);
    }
    @GetMapping("/api/door/accesstype/{accessType}")
    public ResponseEntity<List<Door>> getMethodName(@PathVariable String param) {
        return new ResponseEntity<>(obj.getDoorByType(param),HttpStatus.OK);
    }
    
    
    
}
