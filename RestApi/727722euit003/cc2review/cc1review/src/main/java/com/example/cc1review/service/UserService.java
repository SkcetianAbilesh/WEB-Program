package com.example.cc1review.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cc1review.model.User;
import com.example.cc1review.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @SuppressWarnings({ "null"})
    public User addUser(User user)
    {
        return userRepo.save(user); 
    }

    public List<User> getUser()
    {
        return userRepo.findAll();
    }
    @SuppressWarnings("null")
    public Optional<User> getUserById(Long id)
    {
        return userRepo.findById(id);
    }


    public User editUser(Long id,User user)
    {
        @SuppressWarnings("null")
        User userAvail=userRepo.findById(id).orElse(null); 
        if(userAvail!=null)
        {
            userAvail.setUserAddress(user.getUserAddress());
            userAvail.setUserPhone(user.getUserPhone());
            userAvail.setUserFood(user.getUserFood());  
            userAvail.setTrainNumber(user.getTrainNumber());
            userAvail.setTrainPlatform(user.getTrainPlatform());
            userAvail.setTrainRegistration(user.getTrainRegistration());
            
            return userRepo.saveAndFlush(userAvail);
        }
        else
        return null;
    }

    @SuppressWarnings("null")
    public String deleteUser(Long id)
    {
        userRepo.deleteById(id);
        return("User Deleted");
    }

    public List<User> findByUserAddressList(String userAddresssString)
    {
        return userRepo.findByUserAddress(userAddresssString);

    }
    
}