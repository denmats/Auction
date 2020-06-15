package com.denmats.auction2.model;


import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table
public class ItemBidSummary {

    @Id
    private Long id;
    private String name;
    private Long nob;


    public ItemBidSummary() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getNumberOfBids() {
        return nob;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfBids(Long nob) {
        this.nob = nob;
    }

}
