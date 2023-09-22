package Class19;

public class Parent {

    // refer to Child 1, 2 classes for practice purpose

    String name;
    static String lastName;

    public void hello(){
        System.out.println("public method: Hello from the parent class");
    }
    protected static void bye(){
        System.out.println("Protected method: bye from the parent class");
    }
    private void money(){
        System.out.println("private method: money from the parent class");
    }

}
