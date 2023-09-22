package Class18;

public class ConstructorChain {

    ConstructorChain(){ // Non argument constructor
        System.out.println("I am a Non argument constructor");
    }


    ConstructorChain(String str){// // Parameterized constructor
        this(); // making call to a Non argument constructor
                // this() -> always must be on the first line before System.out.println();
        System.out.println(str);
    }
    ConstructorChain(int number){
        this();
        System.out.println("This is a Constructor with Int type parameter");
    }

    public static void main(String[] args) {

        ConstructorChain chain = new ConstructorChain(10);

        System.out.println("-----End of the Code-------------");

    }
}
