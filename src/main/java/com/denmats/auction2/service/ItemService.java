package com.denmats.auction2.service;

import com.denmats.auction2.dao.ItemDaoImpl;
import com.denmats.auction2.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemDaoImpl itemDaoImpl;

    public List<Item> getAllItems(){
        return itemDaoImpl.getAllItems();
    }

    public Optional<Item> getItemById(Long id){
        return itemDaoImpl.getItemById(id);
    }

    public void deleteItem(Long id){
        itemDaoImpl.deleteItem(id);
    }

    public void insertItem(Item item){
        itemDaoImpl.insertItem(item);
    }
}
