package Class16;

public class Person {

    private double bankBalance=1200058; // private access modifier... Cannot be accessed in other classes
    String address = "1234 San Jose, CA"; // If we don't type any Modifier, it's by default. cannot be accessed in different Package class.
    public String name="Diloo"; // this is public access modifier... can be accessed in any classes, any different package

    private void phonePassword(){ // we dont want to share our phone password except this class
        System.out.println("pass12345");
    }

    void printSSN(){ // we want to share it with some
        System.out.println(123-12-4525);
    }

    public void tikTokAccount(){ // we want to share it to public, accessible
        System.out.println("user1234");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);

        System.out.println("-----using Access Modifiers with methods----\n");

        person.phonePassword();
        person.printSSN();
        person.tikTokAccount();


    }
}
