package com.techelevator;

public class BuyoutAuction extends Auction
{
    private int buyoutPrice;
    private boolean hasWinningBid = false;

    public BuyoutAuction(String itemForSale, int buyoutPrice)
    {
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    public int getBuyoutPrice()
    {
        return buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid)
    {
        boolean isHighBid = false;

        if(!hasWinningBid)
        {
            if (offeredBid.getBidAmount() >= buyoutPrice)
            {
                Bid newBid = new Bid(offeredBid.getBidder(), buyoutPrice);
                isHighBid = super.placeBid(newBid);
                hasWinningBid = true;
            }
            else
            {
                isHighBid = super.placeBid(offeredBid);
            }
        }

        return isHighBid;
    }
}
