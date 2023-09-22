package Class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
1. Write a program to ask the user to enter item that they want to buy and the price of the item.
2. Every time the user enters price, accumulate/add the amount and tell the user that how much total they should pay.
3. If user gives more money, the program should return a change.
4. Whenever, the user is done with the payments, program should say "Thank you for shopping".
         */
        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();

            totalPrice=totalPrice + itemPrice;
            System.out.println("This is the total amount that you have to pay:  "+ totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid = scanner.nextDouble();
        if(amountPaid > totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Dear customer, please get your change "+change);
        }else if(amountPaid < totalPrice){
            System.out.println("You Don't have sufficient money to buy all the item");
        }
        System.out.println("Thank you for shopping with us, Good bye !");
    }
}
