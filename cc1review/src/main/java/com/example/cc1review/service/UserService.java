package com.example.cc1review.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.cc1review.model.User;
import com.example.cc1review.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public User addUser(User user)
    {
        return userRepo.save(user); 
    }

    public List<User> getUser()
    {
        return userRepo.findAll();
    }
    public Optional<User> getUserById(Long id)
    {
        return userRepo.findById(id);
    }


    public User editUser(Long id,User user)
    {
        User userAvail=userRepo.findById(id).orElse(null); 
        if(userAvail!=null)
        {
            userAvail.setUserAddress(user.getUserAddress());
            userAvail.setUserPhone(user.getUserPhone());
            userAvail.setUserFood(user.getUserFood());  
            
            return userRepo.saveAndFlush(userAvail);
        }
        else
        return null;
    }

    public String deleteUser(Long id)
    {
        userRepo.deleteById(id);
        return("User Deleted");
    }

    public List<User> findByUserAddressList(String userAddresssString)
    {
        return userRepo.findByUserAddress(userAddresssString);

    }

    public ResponseEntity<User> editUser(User editedUser, HttpStatus ok) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editUser'");
    }
    
}