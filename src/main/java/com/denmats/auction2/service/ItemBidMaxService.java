package com.denmats.auction2.service;

import com.denmats.auction2.dao.ItemBidMaxDaoImpl;
import com.denmats.auction2.model.ItemBidMax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemBidMaxService {

    private final ItemBidMaxDaoImpl itemBidMaxDaoImpl;

    public ItemBidMaxService(ItemBidMaxDaoImpl itemBidMaxDaoImpl) {
        this.itemBidMaxDaoImpl = itemBidMaxDaoImpl;
    }

    public List<ItemBidMax> findMaxOfBidForItem() { return  itemBidMaxDaoImpl.findMaxOfBidForItem();}
}
