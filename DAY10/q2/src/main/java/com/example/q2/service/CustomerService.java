package com.example.q2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q2.model.Customer;
import com.example.q2.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo obj;
    public Customer postCustomer(Customer customer)
    {
        return obj.save(customer);
    }
    public List<Customer> findByCity(String city)
    {
        return obj.findByCity(city);
    }
    public List<Customer> getCustomers()
    {
        return obj.findAll();
    }
    public Optional<Customer> getById(int id)
    {
        return obj.findById(id);
    }
    public Customer updateById(int id,int pincode)
    {
        Customer c1=obj.findById(id).orElse(null);
        if(c1!=null)
        {
            c1.setPincode(pincode);
            return c1;
        }
        else{
            return null;
        }
    }
    public String deleteById(int id)
    {
       obj.deleteById(id);
       return "Customer deleted successfully";
    }
}
