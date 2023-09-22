package Class19;

public class MainClass {

    MainClass(){

        System.out.println("This is the constructor of the Main Class");
    }
}

    class SubClass extends MainClass{

        SubClass(){
//            super(); If we create or don't create, JVM creates it by default
                super(); // super Keyword makes a call directly to the Main class (parent class)
            // if we create or Not, Java compiler will create a default super() in behind to access the parent class
            System.out.println("This is the constructor of Sub-Class");
        }
    }
