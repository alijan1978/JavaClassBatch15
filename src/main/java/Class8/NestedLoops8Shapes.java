package Class8;

public class NestedLoops8Shapes {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = i; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------Vice Versa------------");
       // Doing Vice Versa to make triangle
        for (int i = 0; i < 10; i++) {

            for (int j = i; j >= 0; j--) {

                System.out.print(j +" ");

            }
            System.out.println();
        }
        System.out.println("--------Opposite direction----------");

        for (int i = 0; i <= 10 ; i++) {
            for (int j = i; j <=10 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------ Triangle Shape-------------");

        for (int i = 0; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-----Diamond shape---------\n");

        for (int i = 0; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 10; j <= 10; j++) {
                System.out.print(i);
            }
            for (int j = i; j <= 10 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
