package Class27;

import Class11.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>(); // Generic concept with the help of Diamond operator < > ... to store on data type at the time

        ArrayList names = new ArrayList(); // Non-Generic concept ArrayList....In Java old version, to store multiple data type mixed up
        names.add("Tahseen");
        names.add(10);
        names.add('A');

    // Object class is the root (God father) of the class hierarchy. Every class has Object as a superclass by default.
    // all objects, including arrays implement the methods of Object class. therefore, every class, or objects in java
    // inherit from this Object class built-in by default. We can simply create an object of this Object class and
    // call our method or give value in Parameter, etc. Similar like Polymorphism that each Parent class can access/have
    // the objects of child classes. So Object class is the Parent of all classes, any other class inherit it by creating its object.


        Object a = new String("some value");
        Object b = new Integer(100);
        Object c = new Scanner(System.in);

        for(Object j : names){
            System.out.println(j);
        }

    }
}
