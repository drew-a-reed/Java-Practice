package CodeWars;
/*Given two numbers and an arithmetic operator
(the name of it, as a string), return the result of the two numbers
having that operator used on them.

a and b will both be positive integers, and a will always be the first
number in the operation, and b always the second.
The four operators are "add", "subtract", "divide", "multiply".*/

import javax.print.DocFlavor;
import java.util.Scanner;

public class ArithmeticFunction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        int firstNum;
        int secondNum;
        String whatToDo;
        String whatToPrint;

        System.out.print("Enter the first number: ");
        input = in.next();
        firstNum = Integer.parseInt(input);
        System.out.print("Enter the second number: ");
        input = in.next();
        secondNum = Integer.parseInt(input);

        System.out.print("What would you like to do to the numbers (multiply, " +
                "divide, add, or subtract): ");
        whatToDo = in.next();
        if (whatToDo.equalsIgnoreCase("add")) {
            whatToPrint = "+";
        } else if (whatToDo.equalsIgnoreCase("subtract")){
            whatToPrint = "-";
        } else if (whatToDo.equalsIgnoreCase("divide")){
            whatToPrint = "/";
        } else {
            whatToPrint = "*";
        }

        System.out.println(firstNum + " " + whatToPrint + " " + secondNum + " = " +
                arithmetic(firstNum, secondNum, whatToDo));

    }

    public static int arithmetic(int a, int b, String operator) {
        if (operator.equalsIgnoreCase("add")) {
            return a + b;
        } else if (operator.equalsIgnoreCase("subtract")) {
            return a - b;
        } else if (operator.equalsIgnoreCase("multiply")) {
            return a * b;
        } else {
            return a / b;
        }
    }
}
