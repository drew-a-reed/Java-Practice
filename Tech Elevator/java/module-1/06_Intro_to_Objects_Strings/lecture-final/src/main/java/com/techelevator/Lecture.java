package com.techelevator;

import java.util.Scanner;

public class Lecture
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        formatFilePath();
    }


    // C:/document/finance.xls
    public static void formatFilePath()
    {
        String filePath;
        String fileName;

        System.out.print("Enter the path and name of a file: ");
        filePath = input.nextLine();

        String regEx = "/";

        String[] pathParts = filePath.split(regEx);

        fileName = pathParts[pathParts.length-1];
        fileName = fileName.replace(".xls", "");

        System.out.println("The name of the file is: " + fileName);

    }

    public static void formatFilePath2()
    {
        String filePath;
        String fileName;

        System.out.print("Enter the path and name of a file: ");
        filePath = input.nextLine();

        String separator = "/";

        char[] chars = filePath.toCharArray();

//        int position = -1;
//        for (int i = 0; i < chars.length; i++)
//        {
//            if(chars[i] == '/')
//            {
//                position = i;
//            }
//        }
//
//        if(position == -1)
//        {
//            System.out.println("incorrect path format");
//            return;
//        }

        int position = filePath.lastIndexOf('/');
        System.out.println(position);

        int startIndex = position + 1;
        int endIndex = filePath.length() - 4;

        System.out.println(startIndex);
        System.out.println(endIndex);

        fileName = filePath.substring(startIndex, endIndex );


        System.out.println("The name of the file is: " + fileName);

    }
}
