package Class18;

public class TestAccount {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        bankAccount.accountNumber=123345566;
        bankAccount.money=5000;
        bankAccount.deposit();

        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.money);

//        bankAccount.transfer();// Methods defined inside a Child class is NOT available to the Parent class

        System.out.println("----Creating Object of Checking Account-------\n");

        CheckingAccount checkingAccount=new CheckingAccount();
        checkingAccount.accountNumber=7894566;
        checkingAccount.money=6500;
        // Features from CheckingAccount Childclass itself

        checkingAccount.interest=0;

        checkingAccount.deposit(); // from Parent Class
        checkingAccount.transfer();// from Child class

        System.out.println("----Creating Object of SavingAccount Class-----\n");

        SavingAccount savingAccount=new SavingAccount();
        savingAccount.accountNumber=234345;
        savingAccount.money=15000;
        savingAccount.profit=500;
//        savingAccount.interest=0.0;// The siblings feature (from child classes) are not available
//        savingAccount.transfer(); // from siblings not available

        savingAccount.deposit(); // from the SavingAccount class


    }
}
