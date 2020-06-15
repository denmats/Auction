package com.denmats.auction2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private List<Bid> bids = new ArrayList<>();

    public Item() {
    }


    public Item(Long id, String name, Double price, Date auctionEnd, List<Bid> bids) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.auctionEnd = auctionEnd;
        this.bids = bids;
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
        return bids;
    }
}
