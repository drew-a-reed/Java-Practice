package com.techelevator;

public class Functions
{
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;

    public static void main(String[] args)
    {
        double one = 5.5;
        double two = 6.6;

        // one and two are arguments
        int answer = add((int)one, (int)two);

//        display("5 + 6 = " + answer);

        String day = new String("Tuesday");
        String restaurant = whereShouldIEat(day);

        restaurant = whereShouldIEat(WEDNESDAY, true);
        display(restaurant);

    }

    // signature
    // int: return type
    // add: name of the function
    // int a , int b: input parameters
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static void display(String message)
    {
        System.out.println(message);
    }


    public static String whereShouldIEat(int dayOfTheWeek)
    {
        if(dayOfTheWeek == TUESDAY)
        {
            return "Costa Vida";
        }
        else if(dayOfTheWeek == WEDNESDAY)
        {
            return "Papa John's Pizza";
        }
        else
        {
            return "Home";
        }

    }

    public static String whereShouldIEat(int dayOfTheWeek, boolean hasMoney)
    {
        if(hasMoney)
        {
            return whereShouldIEat(dayOfTheWeek);
        }

        return "Home";

    }

    public static String whereShouldIEat(String dayOfTheWeek)
    {
        if(dayOfTheWeek.equals("Tuesday"))
        {
            return "Costa Vida";
        }
        else
        {
            return "Home";
        }

//        return "Home";
    }
}
