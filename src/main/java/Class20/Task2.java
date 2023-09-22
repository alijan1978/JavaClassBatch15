package Class20;

public class Task2 {

    static void method(String str1){
        System.out.println("Method with One String");
    }
    static void method(String str1, String str2){
        System.out.println("Method with Two String");
    }
    static void method(String str1, String str2, String str3){
        System.out.println("Method with Three String");
    }

    public static void main(String[] args) {
        // with Static, no need to create object of the class
        method("Java");
        method("Python", "Java");
        method("Python", "Java","SQL");

    }
}
