package com.denmats.auction2.dao;

import com.denmats.auction2.model.ItemBidMax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemBidMaxDaoImpl {

    private final ItemBidMaxDao itemBidMaxDao;

    public ItemBidMaxDaoImpl(ItemBidMaxDao itemBidMaxDao) {
        this.itemBidMaxDao = itemBidMaxDao;
    }

    public List<ItemBidMax> findMaxOfBidForItem() { return  itemBidMaxDao.findMaxOfBidForItem();}
}
