package Class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // 5 times

            for (int j = 0; j < 7; j++) { // inner loop condition is less than 7 times ( 0 - 6 )
                System.out.print(" * ");
            }
            System.out.println(); // space between lines of iteration
        }
    }
}
