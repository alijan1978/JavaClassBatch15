package Class8;

public class NestedLoops3 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 7; j++) {

                if(j == 3 || j == 5){
                    System.out.print(" "); // print space when you reach 3 and 5
                }else {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }


    }
}
