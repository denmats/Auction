package com.denmats.auction2.dao;

import com.denmats.auction2.model.ItemBidSummary;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ItemBidSummaryDaoImpl {

    private final ItemBidSummaryDao itemBidSummaryDao;

    public ItemBidSummaryDaoImpl(ItemBidSummaryDao itemBidSummaryDao) {
        this.itemBidSummaryDao = itemBidSummaryDao;
    }

    public List<ItemBidSummary> findAllItems(){
        return itemBidSummaryDao.findAllItems();
    }

}
