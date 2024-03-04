package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.Address;
// import com.example.ce1.model.Address;
import com.example.ce1.repository.AddressRepo;
import com.example.ce1.repository.PersonRepo;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;

    @Autowired
    PersonRepo personRepo;

    
    @SuppressWarnings("null")
    public Address setAddress(Address address,Long personId)
    {
        
         if(personRepo.existsById(personId))
         {
              addressRepo.setBypersonid(address.getStreet(),address.getCity(), address.getZipcode(), personId);
              return address;
         }
         return null;
    }
}
