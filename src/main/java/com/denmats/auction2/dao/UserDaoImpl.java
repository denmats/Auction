package com.denmats.auction2.dao;

import com.denmats.auction2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers(){
        List<User> list = userDao.findAll();
        return list;
    }

    public Optional<User> getUserById(Long id){
        return userDao.findById(id);
    }

    public void deleteUserById(Long id){
        userDao.deleteById(id);
    }

    public void insertUser(User user){
        userDao.save(user);
    }
}
