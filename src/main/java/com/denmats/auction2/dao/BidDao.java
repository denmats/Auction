package com.denmats.auction2.dao;

import com.denmats.auction2.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidDao extends JpaRepository<Bid, Long> {
}
