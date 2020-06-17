package com.denmats.auction2.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Immutable
@Table
public class UserBidItem {

    @Id
    private Long id;
    private String user_name;
    private String item_name;
    private Double price;
    private Date deadline;
    private Double max_bid;
    private Date bid_date;

    public UserBidItem() {
    }

    public Long getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getItem_name() {
        return item_name;
    }

    public Double getPrice() {
        return price;
    }

    public Date getDeadline() {
        return deadline;
    }

    public Double getMax_bid() {
        return max_bid;
    }

    public Date getBid_date() {
        return bid_date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setMax_bid(Double max_bid) {
        this.max_bid = max_bid;
    }

    public void setBid_date(Date bid_date) {
        this.bid_date = bid_date;
    }
}
