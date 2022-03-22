package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double totalAmount;
		double billGiven;
		double amountToReturn;
		double totalPrice;

		String value;

		System.out.print("What is the total of your order?        $ ");
		value = in.nextLine();
		totalAmount = Double.parseDouble(value);
		totalPrice = (totalAmount * 1.15);
		System.out.print("Enter the amount given by the customer: $ ");
		value = in.nextLine();
		billGiven = Double.parseDouble(value);
		System.out.format("Your total with tax:                    $ %.2f", totalPrice);
		System.out.println();
		amountToReturn = (billGiven - totalPrice);
		System.out.println("--------------------------------------------------------");
		System.out.format("Change to be given:                     $ %.2f", amountToReturn);

	}
}
