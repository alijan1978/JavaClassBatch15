package Class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String string = "Send it to Support channel. Someone will help you there";
        String stored = string.substring(11); // it avoids 11 indexes and prints the rest
        System.out.println(stored);
        // substring Input is number, output is string (letter)

        // In below, we can specify the starting point and ending point of indexes to print
        System.out.println(string.substring(0,10));




    }
}
