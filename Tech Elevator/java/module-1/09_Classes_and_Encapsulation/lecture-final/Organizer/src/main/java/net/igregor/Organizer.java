package net.igregor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Organizer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String goAgain = "y";

        Map<String, Integer> bins = new TreeMap<>();

        while(goAgain.equalsIgnoreCase("y"))
        {
            System.out.print("What are we adding? ");
            String item = input.nextLine().toLowerCase();

            boolean itemExists = bins.containsKey(item);

            if(itemExists)
            {
                int itemCount = bins.get(item) + 1;
                bins.put(item, itemCount);
            }
            else
            {
                bins.put(item, 1);
            }


            System.out.print("Do you want to add something else? ");
            goAgain = input.nextLine();
        }


        System.out.println();
        System.out.println("Let's see what's in the bins!");

        for(Map.Entry<String, Integer> bin : bins.entrySet())
        {
            System.out.println(bin.getKey() + " : " + bin.getValue());
        }

    }
}
