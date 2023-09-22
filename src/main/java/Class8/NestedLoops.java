package Class8;

public class NestedLoops {
    public static void main(String[] args) {

        // the inner loop is the same like system.out.println to print the condition 5 times again and again
        // We use inner loop to iterate or repeat the same code again and again based on given condition

        for (int i = 0; i < 5; i++) { // outer for loop

            for (int j = 0; j < 5; j++) { // inner for loop

                System.out.println(j);
            }
            System.out.println("************************\n");
        }


    }
}
