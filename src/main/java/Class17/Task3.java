package Class17;

public class Task3 {

    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only, where it was declared and executed by calling it's name.
     */

  private static String getOnlyVowels(String inputString){

        return inputString.replaceAll("[AEIOUaeiou]","");
    }

    public static void main(String[] args) {

        System.out.println(getOnlyVowels("I love going to gym everyday")); // remove all vowels alphabets

    }



}
