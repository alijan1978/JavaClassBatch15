package Class32;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        System.out.println("1");
//        System.out.println(10/0);
        try{
            System.out.println("2");
            String name =null;
            name.length();
            System.out.println("3");
        }catch (ArithmeticException ae){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }finally {
            System.out.println("No matter what, this will always be executed");
        }
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");


    }
}
