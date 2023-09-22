package Class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        // write an Array to enter the numbers

        int [] numbers= {10, 20, 30, 40, 50,}; // with Curly Bracket

        // Now write a code to add all the numbers from an Array & give Total

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum+numbers[i];
        }
            System.out.println(sum);


    }
}
