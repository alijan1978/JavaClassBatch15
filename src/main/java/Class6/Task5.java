package Class6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number1  , number2, number3;
        System.out.println("Please enter three numbers");
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        number3 = scan.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println("This is the Largest "+ number1);
        }else if(number2 > number3 && number2 > number1){
            System.out.println("The Largest number is "+number2);
        }else if(number3 > number2 && number3 > number1){
            System.out.println("Largest number is "+number3);



        }



    }
}
