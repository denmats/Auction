package com.denmats.auction2.service;

import com.denmats.auction2.dao.UserBidItemDaoImpl;
import com.denmats.auction2.model.ItemBidMax;
import com.denmats.auction2.model.UserBidItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBidItemService {

    private final UserBidItemDaoImpl userBidItemDaoImpl;

    public UserBidItemService(UserBidItemDaoImpl userBidItemDaoImpl) {
        this.userBidItemDaoImpl = userBidItemDaoImpl;
    }

    public List<UserBidItem> findUserMaxOfBidForItem(){
        return userBidItemDaoImpl.findUserMaxOfBidForItem();
    }
}
