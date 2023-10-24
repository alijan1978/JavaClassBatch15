package Class29;

import java.util.ArrayList;

public class Task4 {
    /*
    Create a class Insurance that will have an attributes as: insuranceName and unimplemented behavior
    as getQuote and cancelInsurance.
    Create 3 subclasses of Car, Pet, Health.
    Car Class has it's own attribute as carModel, and Class Pet has petType attribute.
    Create 3 Objects of the sub-classes and store them in ArrayList.
    Using For Each Loop/ Normal For Loop, and iterator to access all method of the class.
    */
    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("GIECO", "BMW"));
        insurances.add(new Pet("Pet Love", "Cat"));
        insurances.add(new Health("Santa Clara Family Health"));

        for (Insurance i : insurances) {
            i.getQuote();
            i.cancelInsurance();
        }
    }
}

abstract class Insurance {

    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();
}

class Car extends Insurance {

    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println(insuranceName + " quote is $2000 per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can Cancel your insurance any time you want without penalty");
    }
}

class Pet extends Insurance {

    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    public void getQuote() {
        System.out.println(petType + "'s insurancce is $500 per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("you can Cancel your " + insuranceName + " anytime");
    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Your Health insurance is $300 per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can Cancel your " + insuranceName + " anytime with 7% Fee");

    }
}

