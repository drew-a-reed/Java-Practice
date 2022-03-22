package com.techelevator.ui;

import com.techelevator.Auction;
import com.techelevator.Bid;

public class UserOutput
{
    public static void displayWelcome()
    {
        System.out.println();
        System.out.println("***********************************");
        System.out.println("      Welcome to TE Auctions");
        System.out.println("***********************************");

    }

    public static void displayThankYou()
    {
        System.out.println();
        System.out.println("***********************************");
        System.out.println("    Thank You - Please Bid Again");
        System.out.println("***********************************");
    }

    public static void displayWinner(Auction auction)
    {
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Auction: " + auction.getItemForSale());
        System.out.println("-----------------------------------");

        System.out.println("Winning Bid:");
        displayBid(auction.getHighBid());

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("All bids:");
        for(Bid bid : auction.getAllBids())
        {
            System.out.println();
            displayBid(bid);
        }
        System.out.println("-----------------------------------");
        System.out.println();

    }

    private static void displayBid(Bid bid)
    {
        System.out.println("Bidder name: " + bid.getBidder());
        System.out.println("Bid amount: $" + bid.getBidAmount());
    }
}
