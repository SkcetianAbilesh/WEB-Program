package com.example.q2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.q2.model.Customer;
import com.example.q2.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService obj;
    @PostMapping("/api/customer")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer)
    {
        return new ResponseEntity<>(obj.postCustomer(customer),HttpStatus.CREATED);
    }
    @GetMapping("/api/customer/bycity/{city}")
    public ResponseEntity<List<Customer>> getMethod1(@PathVariable String city)
    {
      return new ResponseEntity<>(obj.findByCity(city),HttpStatus.OK);
    }
    @GetMapping("/api/customer")
    public ResponseEntity<List<Customer>> getMethod2()
    {
        return new ResponseEntity<>(obj.getCustomers(),HttpStatus.OK);
    }
    @GetMapping("/api/customer/{customerId}")
    public ResponseEntity<Optional<Customer>> getMethod3(@PathVariable int customerId)
    {
        return new ResponseEntity<>(obj.getById(customerId),HttpStatus.OK);
    }
    @PutMapping("/api/customer/{customerId}/{pincode}")
    public ResponseEntity<Customer> putMethod1(@PathVariable int customerId,@PathVariable int pincode)
    {
        return new ResponseEntity<>(obj.updateById(customerId, pincode),HttpStatus.OK);
    }
    @DeleteMapping("/api/customer/{customerId}")
    public ResponseEntity<String> deleteMethod1(@PathVariable int customerId)
    {
        return new ResponseEntity<>(obj.deleteById(customerId),HttpStatus.OK);
    }
}
