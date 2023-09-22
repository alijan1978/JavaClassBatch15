package Class15;

public class MethodPractice4 {
    /*
    Create a method that takes two numbers as parameters and return the larger number.
    Return type => int
    variable name => largerNumber
    parameters => int num1, int num2
    { if }
     */
    int largerNumber (int num1, int num2){
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
    public static void main(String[] args) {
        MethodPractice4 practice4 = new MethodPractice4();
        System.out.println(practice4.largerNumber(12,13)); // which one is greater

    }
}
