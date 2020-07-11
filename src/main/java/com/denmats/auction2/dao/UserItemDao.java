package com.denmats.auction2.dao;


import com.denmats.auction2.model.UserItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Set;

public interface UserItemDao extends JpaRepository<UserItem,Long> {
    @Query(
            value="select user.id as id, user.name as name, user.surname as surname, item.name as item_name, item.price as price from user left join item on user.id = item.id group by user.surname;",
            nativeQuery=true
    )
    Set<UserItem> findLikedItems();
}
