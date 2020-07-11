package com.denmats.auction2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String address;
    private String account;

    @ManyToMany
    @JoinTable(
            name = "items_like",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    Set<Item> likedItems;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Bid> user_bids = new ArrayList<>();

    public User() {
    }

    public User(Long id, String name, String surname, String address, String account) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getAccount() {
        return account;
    }
}
