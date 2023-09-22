package Class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String string = "I love my family";
        char stored = string.charAt(3); // It stores the letter based on its index to a variable , counts space too

        System.out.println(stored);

//        for (int i = 0; i < string.length(); i++) {
//            System.out.print(string.charAt(i)); // to show all the characters are inside this String

         int counter = 0;

            for (int i = 0; i < string.length(); i++) {

                if (string.charAt(i) == 'a') { // to show how many letter " a " exists in this string
                    counter++;
                }
            }
                System.out.println(counter); // it should 1 letter of 'a'

        }
    }

