package com.denmats.auction2.dao;

import com.denmats.auction2.model.Bid;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BidDaoImpl {

    private final BidDao bidDao;

    public BidDaoImpl(BidDao bidDao) {
        this.bidDao = bidDao;
    }

    public List<Bid> getAllBids(){
        List<Bid> list = bidDao.findAll();
        return list;
    }

    public Optional<Bid> getBidById(Long id){
        return bidDao.findById(id);
    }

    public void insertBid(Bid bid){
        bidDao.save(bid);
    }

    public void deleteBid(Long id){
        bidDao.deleteById(id);
    }
}
