package com.denmats.auction2.controller;


import com.denmats.auction2.model.ItemBidMax;
import com.denmats.auction2.model.UserBidItem;
import com.denmats.auction2.service.UserBidItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/bids/items/max")
public class UserBidItemController {

    private final UserBidItemService userBidItemService;

    public UserBidItemController(UserBidItemService userBidItemService) {
        this.userBidItemService = userBidItemService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserBidItem> findUserMaxOfBidForItem(){
        return userBidItemService.findUserMaxOfBidForItem();
    }
}
