package com.denmats.auction2.controller;


import com.denmats.auction2.model.UserItem;
import com.denmats.auction2.service.UserItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/users/items")
public class UserItemController {

    private final UserItemService userItemService;

    public UserItemController(UserItemService userItemService) {
        this.userItemService = userItemService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Set<UserItem> findLikedItems(){
        return userItemService.findLikedItems();
    }
}
