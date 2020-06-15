package com.denmats.auction2.controller;

import com.denmats.auction2.model.ItemBidSummary;
import com.denmats.auction2.service.ItemBidSummaryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ibs")
public class ItemBidSummaryController {

    private final ItemBidSummaryService itemBidSummaryService;

    public ItemBidSummaryController(ItemBidSummaryService itemBidSummaryService) {
        this.itemBidSummaryService = itemBidSummaryService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<ItemBidSummary> findAllItems(){
        return itemBidSummaryService.findAllItems();
    }
}
