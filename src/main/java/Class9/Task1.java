package Class9;

public class Task1 {
    public static void main(String[] args) {

        // Task 1: Print numbers from 1 - 50 except those that divisible by 3
        System.out.println("----Task 1 -------------------\n");

        for (int i = 1; i <= 50; i++) {
            if(i % 3 != 0){
                System.out.println(i);
            }
        }
        System.out.println("_____Another Way__________\n");

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("----------Another way------------\n");

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
