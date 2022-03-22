package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<>();

		names.add("Thor");
		names.add("Black Widow");
		names.add("The Hulk");
		names.add("Black Panther");
		names.add("Iron Man");

		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}



/*		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");*/

		names.add("Thor");
		names.add(0, "Spiderman");
		names.remove(2);
		names.remove("Thor");

		while (names.contains("Thor"));
		names.remove("Thor");
/*

		System.out.println("Lists allow duplicates");

		System.out.println("Lists allow elements to be inserted in the middle");

		System.out.println("Lists allow elements to be removed by index");

		System.out.println("Find out if something is already in the List");

		System.out.println("Find index of item in List");

		System.out.println("Lists can be turned into an array");

		System.out.println("Lists can be sorted");

		System.out.println("Lists can be reversed too");

		System.out.println("       FOREACH");
*/



	}
}
