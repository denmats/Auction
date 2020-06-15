package com.denmats.auction2.dao;

import com.denmats.auction2.model.ItemBidSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ItemBidSummaryDao extends JpaRepository<ItemBidSummary, Long> {
    @Query(
            value = "select item.id as id, item.name as name, count(bid.id) as nob from item left outer join bid on item.id = bid.item_id group by item.id, item.name",
            nativeQuery = true
    )
    List<ItemBidSummary> findAllItems();
}
