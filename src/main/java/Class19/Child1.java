package Class19;

public class Child1 extends Parent{
    public static void main(String[] args) {

        // Parent class is defined as static class, we don't need to create its object here.
        // we can access static with its (main) parent class and with the other class method if extended through inheritance
        Child1 child=new Child1();
        child.hello(); // public
        //child.money();// it has private access

        child.bye(); // static protected
        Parent.bye(); // we can access static method by its main class name too

        child.name="Khadija jan"; // defalut modifier
        child.lastName="Ali";// static & default





    }
}
