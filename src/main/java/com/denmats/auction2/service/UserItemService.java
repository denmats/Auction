package com.denmats.auction2.service;

import com.denmats.auction2.dao.UserItemDao;
import com.denmats.auction2.dao.UserItemDaoImpl;
import com.denmats.auction2.model.UserItem;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserItemService {

    private final UserItemDaoImpl userItemDaoImpl;

    public UserItemService(UserItemDaoImpl userItemDaoImpl) {
        this.userItemDaoImpl = userItemDaoImpl;
    }

    public Set<UserItem> findLikedItems(){
        return userItemDaoImpl.findLikedItems();
    }
}
