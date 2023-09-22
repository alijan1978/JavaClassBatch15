package Class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String string = "Mohammad Ali Naim 5305704918 $#@&**!!"; // A character is considered as a letter in Java

        int counter = 0;

//        for (int i = 0; i < string.length(); i++) {
//
//            if (Character.isAlphabetic(string.charAt(i))) {
//                counter++;
//
//            }
//        }
//        System.out.println("Total isAlphabetic in string is:  "+counter);

        for (int i = 0; i < string.length(); i++) {

            if (Character.isDigit(string.charAt(i))) { // how many Digits are there
                counter ++;
            }
        }

        System.out.println("Total Digits in string is:  "+counter);
    }
}
