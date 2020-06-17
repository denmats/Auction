package com.denmats.auction2.dao;

import com.denmats.auction2.model.ItemBidMax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemBidMaxDao extends JpaRepository<ItemBidMax, Long> {
    @Query(
            value="select item.id as id, item.name as name, item.price as price, max(bid.amount) as mob from item left outer join bid on item.id = bid.item_id group by item.id, item.name",
            nativeQuery=true
    )
    List<ItemBidMax> findMaxOfBidForItem();

}
