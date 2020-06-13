package com.denmats.auction2.controller;


import com.denmats.auction2.model.User;
import com.denmats.auction2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<User> getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = {"application/json"})
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }
}
