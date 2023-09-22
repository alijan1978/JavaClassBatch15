package Class13;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty, perform the following:
        If the String has an Odd number of characters and has 3 or more characters,
        Print the characters in the middle of the String.
        For Example: String string = "hello"; => l
         */

        String string = "HELLO";

        if(! string.isEmpty()){ // is the string empty ?

            if(string.length() %2 != 0 && string.length() > 3){ // if number of characters are Odd and greater than 3
                // if string is not empty & has an Odd number print it... Or
                // OR if the string is (greater than 3)

                int middle = string.length() / 2; // to give us the Middle Index
                System.out.println(string.charAt(middle));



            }
        }

    }
}
