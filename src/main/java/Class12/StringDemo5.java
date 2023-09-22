package Class12;

public class StringDemo5 {
    public static void main(String[] args) {

        String string = "Java language";
        String string2 = "JAVA language";

        boolean areEqual = string.equals(string2); // If both inputs are the same or equal
        System.out.println(areEqual);

        boolean areEqual2 = string.equalsIgnoreCase(string2); // ignore the lower case
        System.out.println(areEqual2);




    }
}
