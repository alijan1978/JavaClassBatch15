package Class6;

public class WhileLoop8 {
    public static void main(String[] args) {

        // Write a program to Print below sequence with the help of Loop
        //1 2 3 4   6 7 8 9   11 12 13 14 15   16 (Remember No 5, 10, 15 )

        int number = 1;
        while (number <= 16) {
            if (number == 5 || number == 10 || number == 15) {
                // if the number is equal to 5, 10, 15 ,,, Don't do anything

            } else {
                System.out.println(number);

            }
            number++;
        }
    }
}
