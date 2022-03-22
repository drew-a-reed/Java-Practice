package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction
{
    private String itemForSale;
    private Bid currentHighBid;
    private List<Bid> allBids;

    public Auction(String itemForSale)
    {
        this.itemForSale = itemForSale;

        this.currentHighBid = new Bid("", 0);
        allBids = new ArrayList<>();
    }

    public Bid getHighBid()
    {
        return currentHighBid;
    }

    public List<Bid> getAllBids()
    {
        return new ArrayList<>(allBids);
    }

    public String getItemForSale()
    {
        return itemForSale;
    }

    public void setItemForSale(String itemForSale)
    {
        this.itemForSale = itemForSale;
    }

    public boolean placeBid(Bid offeredBid)
    {
        // setup
        boolean isCurrentWinningBid = false;

        // process / calculate
        allBids.add(offeredBid); // always add each bid to the list of bids - even if it did not win
        // check to see if the bid wins
        if (offeredBid.getBidAmount() > currentHighBid.getBidAmount())
        {
            currentHighBid = offeredBid;
            isCurrentWinningBid = true;
        }

        // return the result
        return isCurrentWinningBid;
    }
}
