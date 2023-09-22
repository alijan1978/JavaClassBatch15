package Class13;

public class StringRecap {
    public static void main(String[] args) {

        String string = "Java is Great";

//        // how to print all the letters from the above String
//        for (int i = 0; i < string.length(); i++) {
//
//            System.out.print(string.charAt(i));

            // The  input of charAt() method is Int, but the output is a char or letter
            System.out.println("-----count how many times the letter a has appeared in the String----\n");

            int count=0;
            for (int i = 0; i < string.length(); i++) {
                if(string.charAt(i) == 'a'){
                    count ++;
                }
            }
            System.out.println("Letter 'a' has appeared "+count+" times");
        }
    }
// }
