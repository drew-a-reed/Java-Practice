package com.techelevator.ui;

import com.techelevator.Auction;
import com.techelevator.Bid;

import java.util.Scanner;

public class UserInput
{
    private static final Scanner input = new Scanner(System.in);


    public static String getHomeScreenSelection()
    {
        System.out.println();

        System.out.println("What would you like to do?");
        System.out.println("--------------------------");
        System.out.println("A) Create a new auction");
        System.out.println("B) Bid on an auction");
        System.out.println("D) Display the winner");
        System.out.println("Q) Quit");
        System.out.println();
        System.out.print("Please make a selection: ");

        return input.nextLine().trim().toUpperCase();
    }

    public static Auction getNewAuction()
    {
        System.out.println();

        System.out.print("What is the auction item? ");
        String name = input.nextLine().trim();

        Auction auction = new Auction(name);

        return auction;
    }

    public static Bid getBid(Auction auction)
    {
        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("Bidding on: " + auction.getItemForSale());
        System.out.println("-----------------------------------");
        System.out.print("Please enter the name of the bidder: ");
        String name = input.nextLine().trim();

        System.out.print("Please enter the bid amount (whole dollars only): $");
        String inputValue = input.nextLine();
        int amount = Integer.parseInt(inputValue);

        Bid bid = new Bid(name, amount);

        return bid;
    }
}
