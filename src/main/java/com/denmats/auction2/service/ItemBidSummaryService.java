package com.denmats.auction2.service;

import com.denmats.auction2.dao.ItemBidSummaryDaoImpl;
import com.denmats.auction2.model.ItemBidSummary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemBidSummaryService {

    private final ItemBidSummaryDaoImpl itemBidSummaryDaoImpl;

    public ItemBidSummaryService(ItemBidSummaryDaoImpl itemBidSummaryDaoImpl) {
        this.itemBidSummaryDaoImpl = itemBidSummaryDaoImpl;
    }

    public List<ItemBidSummary> findAllItems(){
        return itemBidSummaryDaoImpl.findAllItems();
    }
}
