package com.techelevator;

import java.sql.SQLOutput;

public class Lecture
{

    public static void main(String[] args)
    {
		
		/* Exercise 1
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
        int numberOfExercises;
        numberOfExercises = 26;

        System.out.println("1. number of exercises: " + numberOfExercises);



		/* Exercise 2
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
        double half = 0.5;

        System.out.println("2. half is: " + half);


		/* Exercise 3
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
        String name = "TechElevator";

        System.out.println("3. name: " + name);


		/* Exercise 4
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
        int seasonsOfFirefly = 1;

        System.out.println("4. Seasons of Firefly: " + seasonsOfFirefly);


		/* Exercise 5
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
        String myFavoriteLanguage = "Java";

        System.out.println("5. Favorite language: " + myFavoriteLanguage);


		/* Exercise 6
		6. Create a variable called pi and set it to 3.1416.
		*/
        final double pi = 3.1416;

        System.out.println("6. pi: " + pi);



		/* Exercise 7
		7. Create and set a variable that holds your name.
		*/
        // NOTE!!! I cannot re-use "name" as the variable
        String myName = "Gregor";

        System.out.println("7. My Name: " + myName);



		/* Exercise 8
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
        int numberOfButtonsOnMouse = 7;

        System.out.println("8. Buttons on my mouse: " + numberOfButtonsOnMouse);



		/* Exercise 9
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
        int percentBatteryLife = 80;

        System.out.println("9. Phone battery remaining: " + percentBatteryLife);



		/* Exercise 10
		10. Create an int variable that holds the difference between 121 and 27.
		*/
        int difference = 121 - 27;

        System.out.println("10. Difference between 121 and 27: " + difference);



		/* Exercise 11
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
        double addition = 12.3 + 32.1;

        System.out.println("11. 12.3 + 32.1: " + addition);



		/*
		11. using meaningful variables
			- You are purchasing 2 items, a charging cable and a new set of headphones
			- charging cable: $12.3
			- headphones: $32.1

			What is the total cost before tax?
		 */
        double costOfCable = 12.3;
        double costOfHeadphones = 32.1;
        double totalCost = costOfCable + costOfHeadphones;

        System.out.println("11 b. Total purchase price: $" + totalCost);



		/* Exercise 12
		12. Create a String that holds your full name.
		*/
        String fullName = "Gregor Dzierzon";

        System.out.println("12. Full Name: " + fullName);



		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
        String greeting = "Hello, " + fullName;

        System.out.println("13. Greeting: " + greeting);


		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
        fullName = fullName + " Esquire";

        System.out.println("14. Full name with Esquire: " + fullName);



		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
        fullName += " Esquire";

        System.out.println("15. Full name with Esquire (part 2): " + fullName);



		/* Exercise 16
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
        String badMovie = "Saw" + 2;

        System.out.println("16. Bad movie: " + badMovie);



		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
        badMovie += 0;

        System.out.println("17. Bad movie (part 2): " + badMovie);


		/* Exercise 18
		18. What is 4.4 divided by 2.2?
			- what does 4.4 represent?
			- what does 2.2 represent?
			- calculations have meaning - make sure that your code shows that meaning
		*/
        double answer  = 4.4 / 2.2;

        System.out.println("18. Double division: " + answer);



		/* Exercise 19
		19. What is 5.4 divided by 2?
			- You have a wall that is 5.4 square feet
			- you want to paint the wall 2 different colors
			- (half red, half black)
			- how many square feet of paint will you need for each color?
		*/
        double squareFeet = 5.4;
        int numberOfColors = 2;
        double squareFeetPerColor = squareFeet / numberOfColors;

        System.out.println("19. Paint Calculator: " + squareFeetPerColor);






		/* Exercise 20
		20. What is 5 divided by 2?
			- You only have $5, but you need to buy something to eat for 2 people
			- how much money do each of you have to spend
		*/
        double money = 5 / 2;

        System.out.println("20. Integer Division (5/2): " + money);



		/* Exercise 21
		21. What is 5.0 divided by 2?
			- You only have $5.00, but you need to buy something to eat for 2 people
			- how much money do each of you have to spend
		*/
        double costsPerPerson = 5.0 / 2;

        System.out.println("21. Double Division (5.0/2): " + costsPerPerson);



		/* Exercise 22
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
        double doubleDivisionAnswer = 66.6 / 100;

        System.out.println("22. Problems with double division (66.6 / 100): " + doubleDivisionAnswer);



		/* Exercise 23
		23. If I divide 5 by 2, what's my remainder?
		*/
        int remainder = 5 % 2;

        System.out.println("23. Working with remainders (5%2): " + remainder);



		/* Exercise 24
		24. What is 1,000,000,000 * 3?
			- I manage 3 accounts with $1 billion each
			- how much total money am I managing?
		*/

        // Option 1: using type casting (long)value
        int value = 1000000000;
        int numberOfAccouts = 3;
        long valueOfAllAccounts = (long)value * numberOfAccouts;

        // Option 2: use the long datatype
//        long value = 1000000000;
//        int numberOfAccouts = 3;
//        long valueOfAllAccounts = value * numberOfAccouts;

        // Option 3: use number literal suffix to treat 1,000,000,000 as a long
//        int numberOfAccouts = 3;
//        long valueOfAllAccounts = 1000000000L * numberOfAccouts;

        System.out.println("24. working with BIG whole numbers: " + valueOfAllAccounts);



		/* Exercise 25
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
        boolean doneWithExercises = false;

        System.out.println("25. We ARE done: " + doneWithExercises );



		/*
		26. Now set doneWithExercise to true.
		*/
        doneWithExercises = true;

        System.out.println("26. We ARE done: " + doneWithExercises );

        /* Exercise 999
        Review: Quiz review - order of operations

        Java can only perform one operation at a time - it uses PEMDAS to determine the order
        P - Parenthesis
        E - Esponents
        MD - Multiplication / Division
        AS - Addision / Subtraction

        if multiple operation have the same precedende it works from left to right (usually)
         */

        int x = (int)((5 / (double)2) * 4);
        x = (int)((5 / 2.0) * 4);
        x = (int)((2.5) * 4);
        x = (int)(10.0);
        x = 10;


    }

}
