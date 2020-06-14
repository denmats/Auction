package com.denmats.auction2.controller;


import com.denmats.auction2.model.Bid;
import com.denmats.auction2.service.BidService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bids")
public class BidController {

    private final BidService bidService;

    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Bid> getAllBids(){
       return bidService.getAllBids();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Bid> getBidById(@PathVariable("id") Long id){
        return bidService.getBidById(id);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = {"application/json"})
    public void insertBid(@RequestBody Bid bid){
        bidService.insertBid(bid);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteBid(@PathVariable("id") Long id){
        bidService.deleteBid(id);
    }

}
