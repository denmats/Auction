package com.denmats.auction2.dao;

import com.denmats.auction2.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Long> {
}
