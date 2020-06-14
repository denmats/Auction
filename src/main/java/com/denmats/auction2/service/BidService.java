package com.denmats.auction2.service;

import com.denmats.auction2.dao.BidDaoImpl;
import com.denmats.auction2.model.Bid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BidService {

    private final BidDaoImpl  bidDaoImpl;

    public BidService(BidDaoImpl bidDaoImpl) {
        this.bidDaoImpl = bidDaoImpl;
    }

    public List<Bid> getAllBids(){
        return bidDaoImpl.getAllBids();
    }

    public Optional<Bid> getBidById(Long id){
        return bidDaoImpl.getBidById(id);
    }

    public void insertBid(Bid bid){
        bidDaoImpl.insertBid(bid);
    }

    public void deleteBid(Long id){
        bidDaoImpl.deleteBid(id);
    }

}
