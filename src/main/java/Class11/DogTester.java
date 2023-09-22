package Class11;

public class DogTester {

    public static void main(String[] args) {

        Dog dogDetails = new Dog();
        dogDetails.bark();
        dogDetails.sleep();
        dogDetails.eat();

        dogDetails.name ="Jacky";
        dogDetails.age=5;
        dogDetails.weight=30.5;
        dogDetails.color="white";
        dogDetails.breed= "Hasky";

        System.out.println(dogDetails.name);
        System.out.println(dogDetails.age);
        System.out.println(dogDetails.weight);
        System.out.println(dogDetails.color);
        System.out.println(dogDetails.breed);

    }
}
