package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Phaser;

public class Lecture {

	public static void main(String[] args) {

		//workingWithSets();
		workingWithMaps();

	}

	private static void workingWithMaps() {
		Map<String, String> customers = new HashMap<>();

		customers.put("CUST1", "John");
		customers.put("CUST2", "Drew");
		customers.put("CUST3", "Tonya");
		customers.put("CUST3", "Dave");
		customers.put("CUST4", "Drew R");

		if(customers.containsKey("CUST4")) {
			System.out.println("He is an A-HOLE and his name is: " + customers.get("CUST4"));
		} else {
			System.out.println("You are a dummy");
		}

		String customerName = customers.get("CUST2");
		System.out.println("CUST2 is: " + customerName);
		System.out.println();
		System.out.println(customers.get("CUST3") + " I AM HERE");
		System.out.println();
		System.out.println(customers.get("CUST4") + " NO, HERE");

		Set<String> customerIds = customers.keySet();
		for (String id : customerIds){
			System.out.println(customers.get(id));
		}
	}

	public static void workingWithSets(){
		Set<String> customerIds = new HashSet<>();

		customerIds.add("Monday");
		customerIds.add("Tuesday");
		customerIds.add("Wednesday");
		customerIds.add("Thursday");
		customerIds.add("Friday");

		for(String customerID : customerIds) {
			System.out.println(customerID);
		}
	}

}
