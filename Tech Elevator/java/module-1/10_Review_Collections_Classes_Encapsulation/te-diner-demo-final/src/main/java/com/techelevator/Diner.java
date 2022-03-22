package com.techelevator;

import com.techelevator.diner.Order;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.LinkedHashMap;
import java.util.Map;

public class Diner
{
    public static void main(String[] args)
    {
        Diner teDiner = new Diner();
        teDiner.run();
    }

    Map<String, Order> orderLine = new LinkedHashMap<>();

    private void run()
    {
        UserOutput.printWelcome();

        // add order here
        do
        {
            // create an order
            Order order = UserInput.getOrder();

            // add the order to the list of orders
            orderLine.put(order.getName(), order);

        } while(UserInput.orderMore());


        // display what was ordered
        for(Map.Entry<String, Order> orderEntry : orderLine.entrySet())
        {
            UserOutput.printOrder(orderEntry.getValue());
        }

        UserOutput.printThankYou();
    }
}
