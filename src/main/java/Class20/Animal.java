package Class20;

import javax.imageio.stream.ImageInputStream;

public class Animal {
    // Just for practice

    String name;
    String color="Black";
    }
    class Cat extends Animal{

    String color="White";
    int age=10;
    double weight;

    void printColor(){
        String color = "Blue";
        System.out.println(color); // prints by default the closer local variable
        System.out.println(this.color); // this keyword  ...prints the child class color, instance variable
        System.out.println(super.color);// super keyword ... prints the parent class color
    }
    /// To test the two above classes
        public static void main(String[] args) {

        Cat cat = new Cat();
        cat.printColor();

    }
}


