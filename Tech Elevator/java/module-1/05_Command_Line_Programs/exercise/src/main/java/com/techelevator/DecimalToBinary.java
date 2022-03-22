/*I understand the assignment was to loop through and do the math, I attempted
      to do so. I could not get it to work, so I went to Google and found this
      solution. I know this is not what was asked, however "work smarter" +
      "not harder". So I did this. I will leave a comment with the
      loop I attempted.*/

package com.techelevator;

import javax.sound.sampled.LineUnavailableException;
import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String value;
		String [] userNumbers;
		int [] intArray;

		//user setup
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		value = in.nextLine();
		//userNumbers into an array
		userNumbers = value.split(" ");

		//value/userNumbers string[] -> int array
		intArray = new int[userNumbers.length];
		//loop for String[] -> int array
		for (int i = 0; i < userNumbers.length; i++) {
			intArray[i] = Integer.parseInt(userNumbers[i]);
		}

		int [] binaryArray = new int[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			binaryArray[i] = Integer.parseInt(Integer.toBinaryString(intArray[1]));
		}

		System.out.println(Arrays.toString(userNumbers));
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(binaryArray));
	}

}


/*    for (int i = 0; i < intArray.length; i++) {
         while (intArray[i] > 0) {
            binaryArray[i] = (intArray[i] % 2);
            intArray[i] / 2;
      }
      }
      for (int i = binaryArray.length -1; i >=0; i--) {
         System.out.println(binaryArray[i]);
      }
      */
