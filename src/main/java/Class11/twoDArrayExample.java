package Class11;

public class twoDArrayExample {
    public static void main(String[] args) {

        int [][] matrix = { {10,20,30,40},
                        {45,55,66,},
                   {30,40,50,20,25,35}
        };
        // Write a loop to print all the elements from this 2D Array

        for (int i = 0; i < matrix.length; i++) {// matrix.length, gives us how many 1D arrays are present in 2D array

            for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length, gives us the size of each 1D array

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
