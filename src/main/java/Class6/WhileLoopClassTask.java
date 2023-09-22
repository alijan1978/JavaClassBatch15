package Class6;

public class WhileLoopClassTask {
    public static void main(String[] args) {

        // write a loop to print numbers from 1 to 100

        int number3 = 1;
        while (number3 <= 100){
            System.out.println(number3);
            number3 ++;
        }
        System.out.println(" ---- Odd Numbers -----");
        // Write a loop to print Odd numbers from 1 to 15

        int number4 = 1;
        while (number4 <= 15){
            System.out.println(number4);
            number4 += 2; // to get odd number
        }
        System.out.println("---- Odd Numbers------");
        //Write a loop to print these numbers 5, 10, 15, 20, 25, 30 ...50

        int number5 = 5; // initialize the value from 5 as its required to start
        while (number5 <= 50){
            System.out.println(number5);
            number5 +=5;

        }

    }
}
