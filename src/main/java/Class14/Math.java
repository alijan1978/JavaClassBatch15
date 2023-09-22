package Class14;

public class Math {

    // Write a method that take 2 Int Numbers, and add them to show the results in Console

    void add (int number1, int number2){
        System.out.println(number1+number2);
    }
// Create a method that takes 3 Int Numbers and multiply them.
// Show the result in Console
    void multiply(int num1, int num2, int num3){
        System.out.println(num1*num2*num3);
    }
    int subtract(int num1, int num2){
        return num1 - num2;
        // Return : tells Java whenever this method is called,
        // what value to return.
    }

}
