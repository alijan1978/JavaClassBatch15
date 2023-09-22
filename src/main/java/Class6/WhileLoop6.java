package Class6;

public class WhileLoop6 {
    public static void main(String[] args) {

        boolean condition = true;
        int number = 0;

        while (condition){
            System.out.println("Hello Beautiful World");
            if(number > 3){
            condition = false; // If the condition be True, it executes infinite loop, never stops.
            // BUT if the condition is false, it will loop until the condition of while Loop is required
        }
            number ++;

        }
    }
}
