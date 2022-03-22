package com.techelevator;

import java.util.Scanner;

class DiscountCalculator
{

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args)
    {

        // setup
        Scanner input = new Scanner(System.in);
        String value;

        String[] prices;
        double discountPercent;
        double originalPrice;
        double totalDiscount;
        double discountedTotal;

        // prompt user
        System.out.println();
        System.out.print("Enter a discount (percent): ");
        value = input.nextLine();
        discountPercent = Double.parseDouble(value);
        discountPercent /= 100;

        System.out.print("Enter a list of prices: ");
        value = input.nextLine();

        // this is the new thing
        prices = value.split(" ");

        for (int i = 0; i < prices.length; i++)
        {
            originalPrice = Double.parseDouble(prices[i]);

            // calculations
            totalDiscount = originalPrice * discountPercent;
            discountedTotal = originalPrice - totalDiscount;

            // display the results
            System.out.println();
            System.out.println("Original Price: " + originalPrice);
            System.out.println("Discount:       " + totalDiscount);
            System.out.println("---------------------------------");
            System.out.println("Total:          " + discountedTotal);
        }


    }

}
