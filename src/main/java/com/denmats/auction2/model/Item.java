package com.denmats.auction2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Date auctionEnd;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Bid> item_bids = new ArrayList<>();

    @ManyToMany(mappedBy = "likedItems")
    Set<User> likes;

    public Item() {
    }


    public Item(Long id, String name, Double price, Date auctionEnd, List<Bid> bids) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.auctionEnd = auctionEnd;
        this.item_bids = item_bids;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public List<Bid> getBids() {
        return item_bids;
    }
}
