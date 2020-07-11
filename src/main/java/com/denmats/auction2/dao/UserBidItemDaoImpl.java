package com.denmats.auction2.dao;

import com.denmats.auction2.model.UserBidItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserBidItemDaoImpl {

    private final UserBidItemDao userBidItemDao;

    public UserBidItemDaoImpl(UserBidItemDao userBidItemDao) {
        this.userBidItemDao = userBidItemDao;
    }


    public List<UserBidItem> findUserMaxOfBidForItem(){
        return userBidItemDao.findUserMaxOfBidForItem();
    }
}
