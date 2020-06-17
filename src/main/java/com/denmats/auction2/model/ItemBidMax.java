package com.denmats.auction2.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Table
public class ItemBidMax {

    @Id
    private Long id;
    private String name;
    private Double price;
    private Double mob;

    public ItemBidMax() {
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

    public Double getMaxOfbids() {
        return mob;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setMaxOfbids(Double maxOfbids) {
        this.mob = maxOfbids;
    }
}
