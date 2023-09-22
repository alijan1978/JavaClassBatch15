package Class3;

public class RelationalOperator {
    public static void main(String[] args) {

        /* Arithmetic Operators
        int + int = int
        int / int = int
        int - int = int

        BUT in Relational Operators : we get always true OR false
        > greater than
        < less than
        >= greater or equal
        <= less than or equal
        != Not equal to
        == equal to

         */

        int number = 10;
        int number1 = 10;
        System.out.println(number1+number);

        boolean result = 20 > 10;
        System.out.println(result);

        System.out.println(20 > 10); // Now we ask JVM, Is 20 Greater than 10 => true
        System.out.println(5>10); // Is 5 greater than 10 => false
        System.out.println(5 != 10); // Is 5 not equal to 10 => true
        System.out.println(5 == 5); // Is 5 equal to 10 =>true
        System.out.println(5 == 10);// Is 5 equal to 10 => false
        System.out.println(10 >= 20); // Is 10 greater or equal to 20 => false
        System.out.println(10 <= 20);// Is 10 less than or equal to 20 => true
        System.out.println(10 <= 10); // Is 10 less than or equal to 10 => true


    }
}
