package com.techelevator;

import java.util.*;

public class Lecture
{

    public static void main(String[] args)
    {
        // demo working with Sets
        //workingWithSets();

        // demo working with Maps
        //workingWithMaps();


        // find customer demo
        String customerName;
        customerName = findCustomer("CUST2");
        System.out.println("Search CUST2 (valid customer): " + customerName);

        customerName = findCustomer("CUST4");
        System.out.println("Search CUST4 (invalid customer): " + customerName);

        customerName = findCustomer("cust2");
        System.out.println("Search cust2 (valid customer but wrong case): " + customerName);

        customerName = findCustomer(null);
        System.out.println("Search null: " + customerName);

        //customer credit demo
        Map<String, Integer> customerCredit = new HashMap<>();

        customerCredit.put("CUST1", 500);
        customerCredit.put("CUST2", 600);
        customerCredit.put("CUST3", 300);

        System.out.println();
        System.out.println("Credit limits BEFORE the update");
        for (Map.Entry<String, Integer> limit : customerCredit.entrySet())
        {
            String customerId = limit.getKey();
            Integer amount = limit.getValue();
            System.out.println(customerId + ": " + amount);
        }

        customerCredit = doubleCreditLimit(customerCredit);

        System.out.println();
        System.out.println("Credit limits AFTER the update");
        for (Map.Entry<String, Integer> limit : customerCredit.entrySet())
        {
            String customerId = limit.getKey();
            Integer amount = limit.getValue();
            System.out.println(customerId + ": " + amount);
        }

    }

    // this function is similar to the first 2 lab exercises
    private static String findCustomer(String customerId)
    {
        Map<String, String> customers = new HashMap<>();
        customers.put("CUST1", "John");
        customers.put("CUST2", "Jane");
        customers.put("CUST3", "Sally");

        return customers.get(customerId);
    }


    // this logic will be similar to the Peter and Paul exercises
    private static Map<String, Integer> doubleCreditLimit(Map<String, Integer> customerCredit)
    {
        Set<String> customerIds = customerCredit.keySet();

        for (String id : customerIds)
        {
            // get the current limit
            int currentLimit = customerCredit.get(id);

            // double the limit
            int doubleLimit = currentLimit * 2;

            // put the new limit back
            customerCredit.put(id, doubleLimit);
        }

        return customerCredit;
    }


    private static void workingWithMaps()
    {
        Map<String, String> customers = new HashMap<>();
        customers.put("CUST1", "John");
        customers.put("CUST2", "Jane");
        customers.put("CUST3", "Sally");
        customers.put("CUST1", "Larry");

        if(customers.containsKey("CUST2"))
        {
            String customerName = customers.get("CUST2");

            System.out.println("CUST2 is: " + customerName);
        }
        else
        {
            System.out.println("NOT FOUND");
        }
        System.out.println();

        // the easiest way to loop through a map
        Set<String> customerIds = customers.keySet();
        for(String id : customerIds)
        {
            String customerName = customers.get(id);
            System.out.println(id + ": " + customerName + "DREW LOOK RIGHT HERE");
        }
        System.out.println();

        // a different way
        // loop through each ROW
        for( Map.Entry<String, String> row : customers.entrySet())
        {
            String id = row.getKey();
            String customerName = row.getValue();
            System.out.println(id + ": " + customerName);
        }





    }

    public static void workingWithSets()
    {
        Set<String> customerIds = new HashSet<>();

        customerIds.add("Monday");
        customerIds.add("Tuesday");
        customerIds.add("Wednesday");
        customerIds.add("Thursday");
        customerIds.add("Friday");
        customerIds.add("MONDAY");
        customerIds.add("monday");
        customerIds.add("MoNdAy");

        for(String value: customerIds)
        {
            System.out.println(value);
        }

        System.out.println();
        System.out.print("Sunday is found in list: ");
        System.out.println(customerIds.contains("Sunday"));

    }



}
