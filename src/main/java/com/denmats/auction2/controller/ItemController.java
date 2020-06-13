package com.denmats.auction2.controller;


import com.denmats.auction2.model.Item;
import com.denmats.auction2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @RequestMapping(value="/{id}")
    public Optional<Item> getItemById(@PathVariable("id") Long id){
        return itemService.getItemById(id);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable("id") Long id){
        itemService.deleteItem(id);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = {"application/json"})
    public void insertItem(@RequestBody Item item){
        itemService.insertItem(item);
    }

}
