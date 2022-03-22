package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ReserveAuction extends Auction
{
    private int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice)
    {
        super(itemForSale); // THIS MUST BE THE FIRST line in the constructor

        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid)
    {
        // setup
        boolean isHighestBid = false;

        if(offeredBid.getBidAmount() >= this.reservePrice)
        {
            isHighestBid = super.placeBid(offeredBid);
        }

        // return the result
        return isHighestBid;
    }
}
