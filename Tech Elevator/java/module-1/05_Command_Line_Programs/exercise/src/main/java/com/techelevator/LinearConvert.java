package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String value;
		double length;

		System.out.print("Please enter the length: ");
		value = in.nextLine();
		length = Double.parseDouble(value);
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		value = in.nextLine();

		if (value.equalsIgnoreCase("M")) {
			metersToFeet(length);
		} else if (value.equalsIgnoreCase("F")){
			feetToMeters(length);
		}
		else {
			System.out.println("You had two options...press (F) or (M)...do not include the parenthesis!");
		}
	}

	public static void feetToMeters(double userLength) {
		int lengthM = (int)(userLength * 0.3048);
		System.out.println(userLength + "f is " + lengthM + "m");
	}

	public static void metersToFeet(double userLength) {
		int lengthF = (int) ((userLength * 3.2808399));
		System.out.println(userLength + "m is " + lengthF + "f");
	}


}


