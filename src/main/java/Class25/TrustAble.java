package Class25;

public interface TrustAble {

    public static final  int age = 10; // all instance variable are by default public, static, final ... they are constant
    String color = "Sadeea jan";

    int trust();

    static void method1(){    // We can have static method inside interface
        System.out.println("Hello World");
    }

    default void method2(){

    }

    private void method3(){

    }

}

    class Bank implements TrustAble{

        @Override
        public int trust() {
            return 0;
        }

        public static void main(String[] args) {
            TrustAble.method1(); // with method
            System.out.println(TrustAble.age); // with instance variable
        }

    }
