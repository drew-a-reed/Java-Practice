package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String value;

		System.out.println("How high would you like this \"Fibonacci Output Printer\" to print \"that name is trademarked\"? ");
		value = in.nextLine();
		int stopBefore = Integer.parseInt(value);

		int fibCount = 0;
		int numberZero = 0;
		int numberOne = 1;
		System.out.print(numberZero + " " + numberOne);

		for (int i = 2; (i + fibCount) < stopBefore; ++i) {
			fibCount = numberOne + numberZero;
			System.out.print(" " + fibCount);
			numberZero = numberOne;
			numberOne = fibCount;

		}
		// 0 1 1 2 3 5 8 13 21.....
		// we always know fibonacci starts at 0 1....ignore start at 1 [second index] not solve with array, loop to get numbers

	}

}
