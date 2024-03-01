package com.example.q3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Village;
import com.example.q3.service.VillageService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class VillageController {
    @Autowired
    VillageService obj;
   @PostMapping("/api/village")
   public ResponseEntity<Village> postMethodName(@RequestBody Village entity) {
       //TODO: process POST request
       
       return new ResponseEntity<>(obj.postVillage(entity),HttpStatus.CREATED);
   }
   @GetMapping("/api/village/byname/{villageName}")
   public ResponseEntity<Village> getMethodName1(@PathVariable String villageName) {
       return new ResponseEntity<>(obj.findByVillageName(villageName),HttpStatus.OK);
   }
   @GetMapping("/api/village/bypopulation/{villagePopulation}")
   public ResponseEntity<List<Village>> getMethodName2(@PathVariable int villagePopulation) {
       return new ResponseEntity<>(obj.findByVillagePopulation(villagePopulation),HttpStatus.OK);
   }
   @GetMapping("/api/village/{villageId}")
   public ResponseEntity<Village> getMethodName(@PathVariable int villageId) {
       return new ResponseEntity<>(obj.findByVillageId(villageId),HttpStatus.OK);
   }
   
   
   
    
}
