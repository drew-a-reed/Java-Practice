package com.techelevator.ui;

import com.techelevator.diner.Order;

public class UserOutput
{
    public static void printWelcome()
    {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("     Welcome to TE Diner");
        System.out.println("*****************************");
        System.out.println();
    }

    public static void printThankYou()
    {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("   Thank You - Come Again!");
        System.out.println("*****************************");
        System.out.println();
    }

    public static void printOrder(Order order)
    {
        System.out.println();
        System.out.println("Order for: " + order.getName());
        System.out.println("------------------------------");
        System.out.println("Is toasted:  " + order.isToasted());
        System.out.println("Extra Jelly: " + order.hasExtraJelly());
    }
}
