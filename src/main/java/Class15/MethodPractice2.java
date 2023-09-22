package Class15;

public class MethodPractice2 {
    /*
    Create a method that takes a String, Reverse it and return the reversed String.
    // Call the method reverseString
    Return type: String
    Datatype: String (for parameter)
    Method's name: reverseString
         */
    String reverseString (String input) {
        String newString = "";

        for (int i = input.length()-1; i >= 0; i--) {
            newString += input.charAt(i);
        }
        return newString;
    }
    // Another way
    String reverseString1 (String input){
        return new StringBuilder(input).reverse().toString();
    }

    // Another way
    String reversString2(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
