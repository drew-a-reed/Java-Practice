package com.techelevator;

import java.util.Scanner;

public class Review
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Do you want to play (Y/N)? ");
        String answer = input.nextLine();
        answer = answer.toUpperCase();

        if(answer.equals("Y"))
        {
            System.out.println("Great! let's play");
            playGame();
        }
        else if(answer.equals("N"))
        {
            System.out.println("Dang! I thought we were friends!");
        }
        else
        {
            System.out.println("I don't understand you.");
        }

    }

    private static void playGame()
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " + name);
    }
}
