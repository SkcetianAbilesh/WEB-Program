package com.example.q3.controller;


import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Language;
import com.example.q3.service.LanguageService;


@RestController
public class LanguageController {
    @Autowired
    LanguageService obj;
    @PostMapping("/language")
    public ResponseEntity<Language> postMethod(@RequestBody Language newLanguage)
    {
         return new ResponseEntity<>(obj.postLanguage(newLanguage),HttpStatus.CREATED);
    }
    @GetMapping("/language")
    public ResponseEntity<List<Language>> getMethod1()
    {
        return new ResponseEntity<>(obj.getLanguage(),HttpStatus.OK);
    }
    @GetMapping("/language/{id}")
    public ResponseEntity<Optional<Language>> getMethod2(@PathVariable int id)
    {
        return new ResponseEntity<>(obj.getLanguageById(id),HttpStatus.OK);
    }
    @PutMapping("/language/{id}")
    public ResponseEntity<Language> putMethod(@PathVariable int id,@RequestBody Language newLang)
    {
        return new ResponseEntity<>(obj.updatebyId(id, newLang),HttpStatus.OK);
    }

    @DeleteMapping("/language/{id}")
    public ResponseEntity<Boolean> deleteMethod(@PathVariable int id)
    {
        return new ResponseEntity<>(obj.deleteById(id),HttpStatus.OK);
    }

}
