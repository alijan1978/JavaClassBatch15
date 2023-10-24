package Class32;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");

        try{
//            System.out.println(10/0); // Arithmetic Exception
            String name = null;// NullPointer Exception because we put the code which might throw an Error

//            String str = "Java";
//            str.charAt(10); // We get StringIndexOutOfBound Exception
            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("We are trying to access a method on a Null Object");
        }
        System.out.println("Line 6");
        System.out.println("Line 7");
        System.out.println("Line 8");
        System.out.println("Line 9");
        System.out.println("Line 10");



    }
}
