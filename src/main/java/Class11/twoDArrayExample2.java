package Class11;

public class twoDArrayExample2 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30, 40},
                {45, 55, 66,},
                {30, 40, 50, 20, 25, 35}
        };
      // with the help of Enhanced For Loop OR For each Loop to get all the elements

        for(int [] array : matrix){

            for(int number : array){

                System.out.print(number + " ");
            }
            System.out.println();
        }

        }
    }
