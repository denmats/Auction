package com.denmats.auction2.dao;

import com.denmats.auction2.model.ItemBidMax;
import com.denmats.auction2.model.UserBidItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserBidItemDao extends JpaRepository<UserBidItem,Long> {

    @Query(
            value="select user.id as id, user.name as user_name, item.name as item_name, item.price as price, item.auction_end as deadline, max(bid.amount) as max_bid, bid.createdon as bid_date  from user left outer join bid on user.id = bid.item_id left join item on bid.item_id = item.id group by user.name, item.name",
            nativeQuery=true
    )
    List<UserBidItem> findUserMaxOfBidForItem();

}
