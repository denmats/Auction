package com.denmats.auction2.dao;

import com.denmats.auction2.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ItemDaoImpl {

    @Autowired
    private ItemDao itemDao;

    public List<Item> getAllItems(){
        List<Item> list = itemDao.findAll();
        return list;
    }

    public Optional<Item> getItemById(Long id){
        return itemDao.findById(id);
    }

    public void deleteItem(Long id){
        itemDao.deleteById(id);
    }
    
    public void insertItem(Item item){
        itemDao.save(item);
    }
}
