package Class18;

public class BankAccount1 {
    int accountNumber=2345454;
}

class Checking1 extends BankAccount1{ // Single Inheritance

    double interest=0.5;
}

class Saving1 extends BankAccount1{ // Hierarchical Inheritance

    int profit = 100;
}

class SuperSaving extends Saving1{ //Multi-level inheritance

    void superSaving(){
        System.out.println("superSaving method is from SuperSaving Class (Multi-level inheritance)");
    }
}

