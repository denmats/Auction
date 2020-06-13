package com.denmats.auction2.service;

import com.denmats.auction2.dao.UserDaoImpl;
import com.denmats.auction2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDaoImpl;

    public List<User> getAllUsers(){
        return userDaoImpl.getAllUsers();
    }

    public Optional<User> getUserById(Long id){
        return userDaoImpl.getUserById(id);
    }

    public void deleteUserById(Long id){
        userDaoImpl.deleteUserById(id);
    }

    public void insertUser(User user){
        userDaoImpl.insertUser(user);
    }
}
