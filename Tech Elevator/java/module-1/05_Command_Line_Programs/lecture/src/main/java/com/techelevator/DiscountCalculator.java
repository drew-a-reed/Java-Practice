package com.techelevator;

import java.io.IOException;
import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("How much was your total?");
        String dinnerPrice = in.next();
        double newPrice = Double.parseDouble(dinnerPrice);
        newPrice = taxMath(newPrice);
        System.out.println("Your total with tax is $" + newPrice);

    }


    public static double taxMath(double price) {
        return price * 1.15;
    }


}
