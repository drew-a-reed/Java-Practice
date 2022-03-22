package com.techelevator;

public class Review
{
    public static void main(String[] args)
    {
        double[] numbers = new double[]{ 12 };

        numbers = resizeArray(numbers, 6);
        numbers[5] = 83;

        double answer = calculateAverage(numbers);

        System.out.println(answer);

    }

    private static double[] resizeArray(double[] numbers, int size)
    {
        double[] result = new double[size];

        for (int i = 0; i < numbers.length; i++)
        {
            result[i] = numbers[i];
        }

        return result;
    }

    private static double calculateAverage(double[] numbers)
    {
        double result = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            result += numbers[i];
        }

        result /= numbers.length;

        return result;
    }



}
