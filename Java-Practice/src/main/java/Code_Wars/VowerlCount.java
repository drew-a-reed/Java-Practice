package CodeWars;

/*Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.*/

class VowelCount {

    public static void main(String[] args) {
        System.out.println(getCount("Thisistheword"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char current;

        // your code here
        for (int i = 0; i < str.length() ; i++) {
            current = str.charAt(i);
            if ((current == 'a') || (current == 'e') || (current == 'i') || (current == 'o') || (current == 'u')){
                vowelsCount++;
            }
        }return vowelsCount;
    }
}
