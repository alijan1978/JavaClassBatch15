package Class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        // Lets use Scanner class at the end of this practice

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your gender M or F");
//        char gender=scan.next().charAt(0);

        char gender='w';

        switch (gender){
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            default:
                System.out.println("Gender Not Specified");
        }



    }
}
