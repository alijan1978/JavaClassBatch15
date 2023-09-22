package Class10;

import java.util.Arrays;

public class twoDArrays1 {
    public static void main(String[] args) {

        int[][] matrix = { {10,20,30},
                           {55,22,45,60,80,90,15,57,},
                           {100,220,450}, };

        System.out.println(matrix[1][1]); // Row 1, column 1 => 22
        System.out.println(matrix[2][2]); // Row 2, column2  => 450

        // The first bracket  [1] is Row
        // The second bracket [1] is column

        System.out.println("------To print all the numbers of 3 Rows --------\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]+" ");

            }

            System.out.println();
        }
    }
}
