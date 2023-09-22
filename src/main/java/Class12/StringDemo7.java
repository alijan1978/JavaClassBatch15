package Class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String string = "I love my wife";
        boolean startsWith = string.startsWith("I");
        System.out.println(startsWith);

        System.out.println(string.endsWith("wife"));

        // Method chaining is when multiple methods are called on the same line
        // ONly those methods can be chained which returns a String

        System.out.println(string.toLowerCase().startsWith("i"));

        System.out.println(string.contains("love")); // check if some letters/words are present

        String name = "Ahmad";
        char showCharacterList [] = name.toCharArray(); // It shows the String type name "Ahmad", to its number of characters letter by letter.

        for (int i = 0; i < showCharacterList.length; i++) {
            System.out.println(showCharacterList[i]);
        }

    }
}
