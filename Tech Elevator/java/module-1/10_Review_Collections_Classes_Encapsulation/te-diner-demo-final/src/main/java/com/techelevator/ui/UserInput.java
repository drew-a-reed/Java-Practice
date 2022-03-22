package com.techelevator.ui;

import com.techelevator.diner.Order;

import java.util.Scanner;

public class UserInput
{
    private static final Scanner input = new Scanner(System.in);
    private static String value = "";

    public static Order getOrder()
    {
        System.out.println();
        System.out.print("What is your name? ");
        String name = input.nextLine().trim();

        System.out.print("Do you want the sandwich toasted (y/n)? ");
        value = input.nextLine().trim().toLowerCase();
        boolean isToasted = value.equals("y");

        System.out.print("Do you want extra jelly (y/n)? ");
        value = input.nextLine().trim().toLowerCase();
        boolean hasExtraJelly = value.equals("y");

        Order order = new Order(name);
        order.setToasted(isToasted);
        order.setHasExtraJelly(hasExtraJelly);

        return order;
    }

    public static boolean orderMore()
    {
        System.out.println();
        System.out.print("Would you like to add another PB&J (y/n)? ");
        value = input.nextLine().trim().toLowerCase();

        return value.equals("y");
    }
}
