package com.denmats.auction2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Date auctionEnd;

    public Item(Long id, String name, Double price, Date auctionEnd) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.auctionEnd = auctionEnd;
    }

    public Item() {
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", auctionEnd=" + auctionEnd +
                '}';
    }
}
