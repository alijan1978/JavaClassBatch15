package Class3;

public class Task4Operators {
    public static void main(String[] args) {

        /* Write a Java program to add, subtract, multiply, and divide 2 Decimal values.
        Your program should say "The addition of 2 numbers are equal to "
        Expected Output:
        --> The addition of 2 numbers 10.5 and 10.5 is equal to 21.0
        --> The subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
        --> The multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
        --> The division of 2 numbers 10.5 is equal to 1.0
         */

        double number1 = 10.5;
        double number2 = 10.5;
        double addition = number1+number2;
        System.out.println("The addition of 2 numbers 10.5 and 10.5 is equal to "+ addition);

        double subtraction = number2-number1;
        System.out.println("The subtraction of 2 numbers 10.5 and 10.5 is equal to "+ subtraction);

        double multiplication = number1*number2;
        System.out.println("The multiplication of 2 numbers 10.5 and 10.5 is equal to "+multiplication);

        double division = number2/number1;
        System.out.println("The division of 2 numbers 10.5 is equal to "+division);

    }
}
