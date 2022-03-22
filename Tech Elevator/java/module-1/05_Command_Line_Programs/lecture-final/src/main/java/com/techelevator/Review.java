package com.techelevator;

public class Review
{
    public static void main(String[] args)
    {
        int[] gregorsHouse = {8,7,12};
        int[] amysHouse = rotateLeft3(gregorsHouse);
        amysHouse[2] = 100;

        String name = new String("Gregor");
    }

    public static int[] rotateLeft3(int[] nums)
    {
        // setup && logic
        int[] destination = new int[nums.length];
        int temp = nums[0];

        // logic
        for (int i = 1; i < nums.length; i++)
        {
            destination[i-1] = nums[i];
        }
        destination[nums.length - 1] = temp;

        // return
        return destination;
    }
}
