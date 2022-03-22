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

        int numberOfExercises = 26;
        System.out.println("1. numberOfExercises ");


		/* Exercise 2
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

        double half = 0.5;
        System.out.println("2. Double is " + half);

		/* Exercise 3
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

        String name = "TechElevator";
        System.out.println("3: " + name);


		/* Exercise 4
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

        int seasonsOfFirefly = 1;
        System.out.println("4: " + seasonsOfFirefly);


		/* Exercise 5
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

        String myFavoriteLanguage = "Java";
        System.out.println("5: " + myFavoriteLanguage);

		/* Exercise 6
		6. Create a variable called pi and set it to 3.1416.
		*/

        double pi = 3.1416;
        System.out.println("6: " + pi);

		/* Exercise 7
		7. Create and set a variable that holds your name.
		*/

        String myName = "Drew";
        System.out.println("7: " + myName);

		/* Exercise 8
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

        int numOfMouseButtons = 3;
        System.out.println("8: " + numOfMouseButtons);

		/* Exercise 9
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

        int batteryPercentage = 75;
        System.out.println("9: " + batteryPercentage);

		/* Exercise 10
		10. Create an int variable that holds the difference between 121 and 27.
		*/

        int diffOfNumbers = 121 - 27;
        System.out.println("10: " + diffOfNumbers);

		/* Exercise 11
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

        double sumOfNumbers = 12.3 - 32.1;
        System.out.println("11: " + sumOfNumbers);

		/*
		11. using meaningful variables
			- You are purchasing 2 items, a charging cable and a new set of headphones
			- charging cable: $12.3
			- headphones: $32.1

			What is the total cost before tax?
		 */

            double totalCost = 12.3 + 32.1;
        System.out.println("11: Your total is: " + totalCost);

		/* Exercise 12
		12. Create a String that holds your full name.
		*/

        String myFullName = "Drew Reed";
        System.out.println("12: " + myFullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/

            String  helloName = "Hello, " + myFullName;
        System.out.println("13: " + helloName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

            myFullName = myFullName + " Esquire";
        System.out.println("14: " + myFullName);

		/* Exercise 15
		15. Now do the same as exercise 14, but use the += operator.
		*/

//        myFullName += " Esquire";
//        System.out.println("15: " + myFullName);

		/* Exercise 16
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

            String newWord = "Saw" + 2;
        System.out.println("16: " + newWord);

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

            newWord = newWord + 0;
        System.out.println("17:  " + newWord);

		/* Exercise 18
		18. What is 4.4 divided by 2.2?
			- what does 4.4 represent?
			- what does 2.2 represent?
			- calculations have meaning - make sure that your code shows that meaning
		*/

            double numerator = 4.4;
            double denominator = 2.2;
            double mathAnswer = numerator / denominator;
        System.out.println("18: " + mathAnswer);

		/* Exercise 19
		19. What is 5.4 divided by 2?
			- You have a wall that is 5.4 square feet
			- you want to paint the wall 2 different colors
			- (half red, half black)
			- how many square feet of paint will you need for each color?
		*/

            double squareFeet = 5.4;
            int numOfColors = 2;
            double squareFeetPerColor = squareFeet / numOfColors;
        System.out.println("19: " + "You need " + squareFeetPerColor + " of both red and black.");

		/* Exercise 20
		20. What is 5 divided by 2?
			- You only have $5, but you need to buy something to eat for 2 people
			- how much money do each of you have to spend
		*/

        int amountOfMoney = 5;
        int numOfPeople = 2;
        double amountPerPerson = amountOfMoney / numOfPeople;
        System.out.println("20: " + "You can spend " + amountPerPerson + " each");


		/* Exercise 21
		21. What is 5.0 divided by 2?
			- You only have $5.00, but you need to buy something to eat for 2 people
			- how much money do each of you have to spend
		*/

        double amountOfMoneyOne = 5.0;
        double numOfPeopleOne = 2.0;
        double amountPerPersonOne = amountOfMoneyOne / numOfPeopleOne;
        System.out.println("21: " + "You can spend " + amountPerPersonOne + " each");

		/* Exercise 22
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

        double ansToNewMath = 66.6 / 100;
        System.out.println("22: " + ansToNewMath);

		/* Exercise 23
		23. If I divide 5 by 2, what's my remainder?
		*/

        int remainderOfMath = 5 % 2;
        System.out.println("23: " + remainderOfMath);

		/* Exercise 24
		24. What is 1,000,000,000 * 3?
			- I manage 3 accounts with $1 billion each
			- how much total money am I managing?
		*/

        long value = 1000000000;
        long numOfAccounts = 3;
        long totalAccountValue = value * numOfAccounts;
        System.out.println("24: " + totalAccountValue);

		/* Exercise 25
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/

        boolean doneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/

            doneWithExercises = true;

    }

}
