package com.denmats.auction2.dao;

import com.denmats.auction2.model.UserItem;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class UserItemDaoImpl {

    private final UserItemDao userItemDao;


    public UserItemDaoImpl(UserItemDao userItemDao) {
        this.userItemDao = userItemDao;
    }

    public Set<UserItem> findLikedItems(){
        return userItemDao.findLikedItems();
    }
}
