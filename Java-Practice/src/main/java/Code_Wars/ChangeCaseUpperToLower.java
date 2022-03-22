package Code_Wars;

import java.util.Locale;

public class ChangeCaseUpperToLower {

    public static void main(String[] args) {
        System.out.println(solve("HI jo"));
    }

    public static String solve(final String str) {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                lowerCaseCount ++;
            } else if(Character.isUpperCase(str.charAt(i))){
                upperCaseCount ++;
            }
        }
        if (upperCaseCount > lowerCaseCount) {
            return str.toUpperCase();
        } else if (lowerCaseCount > upperCaseCount) {
            return str.toLowerCase();
        } else return str.toLowerCase();
    }
}
