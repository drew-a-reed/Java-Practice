package com.techelevator;

public class ArrayDemo
{
    public static void main(String[] args)
    {
//        int[] scores = new int[3];
//        scores[0] = 98;
//        scores[1] = 75;
//        scores[2] = 83;

        int[] scores = {98, 75, 83};

        int lastIndex = scores.length - 1;
        System.out.println(scores.length);
        System.out.println(scores[lastIndex]);

        printAllScores(scores);

    }

    private static void printAllScores(int[] array)
    {
        int x = 1;
        System.out.println(++x); // increments x first and then prints
        System.out.println();
        System.out.println();

        for(int i = 0; i < 3; i++)
        {
            System.out.println(array[i]);
        }
    }
}
