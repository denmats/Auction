package com.denmats.auction2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@org.hibernate.annotations.Immutable
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Date createdON;

    public Bid() {
    }

    public Bid(Long id, Double amount, Date createdON) {
        this.id = id;
        this.amount = amount;
        this.createdON = createdON;
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
}
