import java.util.Scanner;

public class HelloWorld {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.next();

        System.out.println("Hello " + name);
        System.out.println("Hello World!");
        System.out.println("Hello");
    }

}
