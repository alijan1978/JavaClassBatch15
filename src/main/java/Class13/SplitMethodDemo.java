package Class13;

public class SplitMethodDemo {
    public static void main(String[] args) {

        String string = "I like Java. I write a lot of code daily. I am from batch 15.";

        String [] stringArray = string.split("[.?!]");

        System.out.println(stringArray.length); // This length shows that we have 3 sentences
        System.out.println(stringArray[2]);// this code prints with split method the index 2
        // Whenever we deal with Arrays, we use the JUST length
        // Whenever we deal with Strings, we use the length()



    }
}
