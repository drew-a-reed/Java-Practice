package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture
{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        formatFilePath2();
    }

    public static void formatFilePath() {
        String filePath;
        String fileName;

        System.out.print("Enter the path and name of a file: ");
        filePath = input.nextLine();

        String[] pathParts = filePath.split("/");
        System.out.println(Arrays.toString(pathParts));

        fileName = pathParts[pathParts.length-1];

        System.out.println("The name of the file is: " + fileName);
    }

    public static void formatFilePath2() {
        String filePath;
        String fileName;

        System.out.print("Enter the path of a file: ");
        filePath = input.nextLine();

        int position = filePath.lastIndexOf('/');
        int startIndex = position + 1;
        int endIndex;
        int testIndex = filePath.lastIndexOf('.');;

        if (testIndex > 0) {
            endIndex = testIndex;
        } else {
            endIndex = filePath.length();
        }

        fileName = filePath.substring(startIndex, endIndex);
        System.out.println("The name of your file is: " + fileName);
    }
}
