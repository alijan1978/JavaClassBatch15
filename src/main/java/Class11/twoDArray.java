package Class11;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {

        int[][] matrix = { {10, 20, 30},
                           {45, 55, 66},
                           {30, 40, 20, 10, 25}
        };

        System.out.println("Row # 3, column # 4: "+matrix[2][4]); // to access number 25 in row # 3, column # 4

        System.out.println(Arrays.toString(matrix[0])); // To access all elements of Row # 0

        for (int i = 0; i <matrix[0].length; i++) {
            System.out.println(matrix[0][i]); //  Also To access all Row # 1
        }

        System.out.println("------------------------------------------\n");

        int [] array=matrix[0];

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }


    }
}
