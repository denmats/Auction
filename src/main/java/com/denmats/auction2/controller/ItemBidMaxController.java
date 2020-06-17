package com.denmats.auction2.controller;

import com.denmats.auction2.dao.ItemBidMaxDao;
import com.denmats.auction2.model.ItemBidMax;
import com.denmats.auction2.service.ItemBidMaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bids/max")
public class ItemBidMaxController {

    private final ItemBidMaxService itemBidMaxService;

    public ItemBidMaxController(ItemBidMaxService itemBidMaxService) {
        this.itemBidMaxService = itemBidMaxService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<ItemBidMax> findMaxOfBidForItem(){
        return  itemBidMaxService.findMaxOfBidForItem();
    }

}
