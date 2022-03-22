package Code_Wars;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(13));

    }

        public static int factorial(int n){
           int mathWork = 1;

            if (n < 0 || n > 12) {
                throw new IllegalArgumentException();
            } else if (n == 0) {
                return 1;
            } else {
                while (n > 0) {
                    mathWork *= n;
                    n--;
                }
            } return mathWork;
        }
    }
