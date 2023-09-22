package Class2;

public class DecimalNumber {
    public static void main(String[] args) {

        // To store SMALL Decimal numbers (10.5, 11.2, 1.6) in computer's memory using Java, we should use Float :
        // To store LARGE Decimal numbers, we should use Double datatype:
        // Note: At the end of your Decimal in Float type, write "f" otherwise JVM won't recognize it

        float myNumber = 10.5f;
        float mySecondBox = 5.5f;

        double largeDecimalBox = 12345678.122;
        System.out.println(myNumber);

        // To store SINGLE English Letter, we use Char datatype by using single quote, Ex: 'M' :
        // To store Multiple Letters or write something, we use String, using double quote, Ex: "Khadija Ali" :

        char letter = 's';
        char gender = 'M';
        char symbol = '@';
        char numberChar = '7';

        // String data type belongs to a different category called Non-Primitive datatype. That's why, for String the rules
        // a little different. For example: first letter of String "S" is Upper case, it is also Not Colored.

        String name = "Sadeea Ali";

    // To store either True or False value, we use Boolean datatype:

        boolean hungry = true; // true means YES
        boolean sleepy = false; // false means NO

    }
}
