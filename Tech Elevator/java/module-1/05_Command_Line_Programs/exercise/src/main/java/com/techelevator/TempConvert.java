package com.techelevator;

import java.util.Scanner;

public class TempConvert
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value;
        double temperature;

        System.out.print("Please enter the temperature: ");
        value = in.nextLine();
        temperature = Double.parseDouble(value);
        System.out.print("Is the temperature in (C)elcius or (F)ahrenheit? ");
        value = in.nextLine();

        if (value.equalsIgnoreCase("F")) {
            temperatureFarenheit(temperature);
        } else if (value.equalsIgnoreCase("C")){
            temperatureCelcius(temperature);
        }
        else {
            System.out.println("You had two options...press (C) or (F)...do not include the parenthesis!");
        }
    }

    public static void temperatureCelcius(double userTemp) {
        int tempC = (int)(userTemp * 1.8 + 32);
        System.out.println(userTemp + "C is " + tempC + "F");
    }

    public static void temperatureFarenheit(double userTemp) {
        int tempF = (int) ((userTemp - 32) / 1.8);
        System.out.println(userTemp + "F is " + tempF + "C");
    }

}
