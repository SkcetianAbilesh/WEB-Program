package springapp.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import springapp.demo.modal.Address;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AddressController {
    @GetMapping("/get")
    public Address getAddress(){
        Address obj=new Address("thor", 30);
        return obj;
    }
    
}
