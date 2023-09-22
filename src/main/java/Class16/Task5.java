package Class16;

public class Task5 {
    /*
    Write a method to return whether given number is Prime or not ?
    Return type -> boolean
    method's name -> isPrime
    parameters -> int number
     */
    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        System.out.println(task5.isPrime(13));
    }
}
// Class 16, min 1:15
