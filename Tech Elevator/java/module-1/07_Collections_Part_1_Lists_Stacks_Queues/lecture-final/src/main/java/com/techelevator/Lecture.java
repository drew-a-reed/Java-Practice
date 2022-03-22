package com.techelevator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<>();
		List<Integer> scores = new ArrayList<>();

		// boxing
		scores.add(5);
		scores.add(11);

		// unboxing
		int num = scores.get(0);

		names.add("Thor");
		names.add("Black Widow");
		names.add("Hawkey");
		names.add("Black Panther");
		names.add("Hulk");


//		System.out.println(names.get(0));

		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Thor");
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(0, "Spiderman");
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();



		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(0);
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by object");
		System.out.println("####################");

		names.remove("Thor");
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();



		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		names.add("Thor");
		names.add("Thor");
		names.add("Thor");

		boolean hasName = names.contains("Thor");
		System.out.println(hasName);

		while(names.contains("Thor"))
		{
			names.remove("Thor");
		}


		hasName = names.contains("Thor");
		System.out.println("Thor exists: "  + hasName);

		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int whereIsHulk = names.indexOf("Thor");
		System.out.println(whereIsHulk);
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String [] words = names.toArray(new String[names.size()]);
		System.out.println(words[0]);
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);

		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();



		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println();
		System.out.println();


		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();



		for (int i = 0; i < names.size(); i++)
		{
			String name = names.get(i);
			System.out.println(name);
		}

		System.out.println();

		for(String name : names)
		{
			System.out.println(name);
		}

		System.out.println();
		System.out.println();


	}
}
