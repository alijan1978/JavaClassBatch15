package Class20;

public class Task3 {

// Same requirement of Task2 ... this time we use private modifier to show that we can overload it
    private void method(String str1) {
        System.out.println("Method with One String");
    }

    private void method(String str1, String str2) {
        System.out.println("Method with Two String");
    }

    private void method(String str1, String str2, String str3) {
        System.out.println("Method with Three String");
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        task3.method("Java");
        task3.method("Python", "Java");
        task3.method("Python", "Java", "SQL");
    }
}