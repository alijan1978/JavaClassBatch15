package Class23;

public abstract class Animal {

    abstract void speak(); // If we don't want to have an implementation, we create the method as "abstract"
    // We should declare the Class also as "abstract" ... This way, no one can create object of this class

    class Dog extends Animal{
        @Override
        void speak() {
            System.out.println("Dop speaks Wuff Wuff");
        }
    }

    class Cat extends Animal{
        @Override
        void speak() {
            System.out.println("Cat speaks Meow Meow");
        }
    }

}


