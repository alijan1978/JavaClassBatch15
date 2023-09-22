package Class13;

public class Task2 {
    public static void main(String[] args) {

        // Create a String and print it in Reverse Order (Sunday -> yadnuS )

//        String string = "Sunday";
        String string = "I love Java";

        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
        System.out.println("-----Show the Reverse Order------\n");

        for (int i = 5; i >= 0; i--) { // Here it just Reverse 5 indexes of characters
            System.out.print(string.charAt(i));
        }
        System.out.println();
        System.out.println("----Now it can print any desired string to Reverse Order-----\n");

        for (int i = string.length()-1; i >= 0; i--) { // Here it Reverse as many characters length
            // we tell computer, the length of the string -1... to start from last index and perform Reverse
            System.out.print(string.charAt(i));
        }


    }
}
