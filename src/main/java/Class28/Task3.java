package Class28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of words, Remove every word that ends with "e" .
         */

        ArrayList<String> makeUP=new ArrayList<>();
        makeUP.add("Lipstick");
        makeUP.add("Eyeline");
        makeUP.add("Blueshine");
        makeUP.add("Foundation");
        makeUP.add("Cream");
        makeUP.add("FaceWash");
        makeUP.add("Toothbrush");

        // use Lambda Expression to remove element

        makeUP.removeIf(x -> x.endsWith("e")); // it removes only words that ends with 'e'
        makeUP.removeIf(x -> x.contains("e")); // it removes all words that contains 'e'

        System.out.println(makeUP);

    }
}
