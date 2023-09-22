package Class12;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CarTester {
    public static void main(String[] args) {

        // Create the object of the Car class
        //Important: inside the class the sequence doesn't matter (field or behavior should be first)
        // because we call the fields based on sequence through the object in SOUT

        Car object = new Car();

        object.make=("Toyota");
        object.model=("Corolla");
        object.color=("White");
        object.year=2023;

        object.moveForward();
        object.applyBrakes();

        System.out.println(object.make);
        System.out.println(object.model);
        System.out.println(object.color);
        System.out.println(object.year);

        System.out.println("----------Creating Oject of another Car-----------\n");

        // We can create as many objects as we want... hundreds/thousands

        Car object2 = new Car();
        object2.make = ("Honda");
        object2.model=("Accurd");
        object2.color=("Red");
        object2.year=2020;

        object2.moveForward();
        object2.applyBrakes();

        System.out.println(object2.make);
        System.out.println(object2.model);
        System.out.println(object2.color);
        System.out.println(object2.year);


    }
}
