package Class15;

public class MethodPractice3 {
    /*
    Create a Method that takes an array of Int, sum all the elements from the array, and return the sum
    Return type: int
    Method: arraySum
    parameters: int [] array
         */


    int arraySum(int [] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

}

// Class 15, minute 2:30