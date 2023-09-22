package Class22;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest
    Create 2 SubClasses (Visa and AX). in AX class, override the method calculate interest.
    Call the method by creating an object of each of the three classes
     */
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest) / 100); // to get the interest
    }
}
    class Visa extends CreditCard {

    public Visa(double balance, double interest){
        super(balance, interest); // referring to parents fields

    }
}
    class AX extends CreditCard {
        public AX(double balance, double interest) {
            super(balance, interest);
        }

        @Override   // Annotation generated.... we created override method by right click shortcut (Generate)
        public void calculateInterest() {
            System.out.println("Interest "+(balance*interest/100)+30);  // we changed it
        }

        // Calling the Object of three methods here
        public static void main(String[] args) {
            CreditCard creditCard = new CreditCard(100, 10);
            creditCard.calculateInterest();

            Visa visa = new Visa(100, 10);
            visa.calculateInterest();

            AX ax = new AX(100, 10);
            ax.calculateInterest();

        }
    }
