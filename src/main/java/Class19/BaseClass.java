package Class19;

public class BaseClass {

    String name = "Zainab";

    void hello() {
        System.out.println("Hello method from the BaseClass");
    }
}

class Child extends BaseClass {
    String name = "Tahseen";

    void callMe() {
        System.out.println(name); // Refers to current Child class local variable (name)
        System.out.println(super.name); // Refers to parent class instance variable (name) with super keyword
    }

    void hello() {
        System.out.println("Hello method from the BaseClass"); // method in Child class
    }

    void callingParentMethod() {
        hello();
        super.hello(); // super keyword, Refers to Instance method from Parent class

    }

    public static void main(String[] args) {

        Child child = new Child();
        child.callMe();
        child.callingParentMethod();

    }
}


