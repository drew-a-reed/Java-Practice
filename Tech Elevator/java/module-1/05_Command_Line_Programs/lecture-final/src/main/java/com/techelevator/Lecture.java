package com.techelevator;

import java.io.IOException;
import java.util.Scanner;

public class Lecture
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        String value;

        System.out.print("Enter your id: ");
        value = input.nextLine();
        int number = Integer.parseInt(value);
        System.out.println("id: " + number);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name);

        System.out.print("Enter your age: ");
        value = input.nextLine();
        int age = Integer.parseInt(value);
        System.out.println("You are " + age + " years old.");

        System.out.println(value);
    }
}
