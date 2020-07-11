package com.denmats.auction2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Date createdON;

    @ManyToOne
    private Item item;

    @ManyToOne
    private User user;


    public Bid() {
    }

    public Bid(Long id, Double amount, Date createdON, Item item) {
        this.id = id;
        this.amount = amount;
        this.createdON = createdON;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getCreatedON() {
        return createdON;
    }

    public Item getItem() {
        return item;
    }
}
