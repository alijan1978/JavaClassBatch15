package Class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        /* print this pattern:
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */

//        for (int i = 0; i < 3; i++) {
//            System.out.println("1 2 3 4 5");
//            }
//
//            System.out.println();

        for (int i = 0; i < 3 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();

        }

    }
}
