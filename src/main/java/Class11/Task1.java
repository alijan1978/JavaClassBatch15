package Class11;

public class Task1 {
    public static void main(String[] args) {

        /* write a code to show the following stars * shape:

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */
        for (int i = 1; i <= 4; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("* "); // So far, it just prints the upper part it
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {

            for (int j = 0; j < 4 - i; j++) {

                System.out.print("* "); // Now, the lower part will print
            }
            System.out.println();
        }
    }
}