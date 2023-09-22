package Class17;

public class DogTester {

    public static void main(String[] args) {
        Dog husky = new Dog("While Husky", "thiny husky", 5, 12.5);
        Dog bulldog = new Dog("Bulldog", "wild bulldog", 4,10.3);
        Dog labrador = new Dog("Labrador", "Labrador silver", 2, 6.5);
        husky.printInfo();
        bulldog.printInfo();
        labrador.printInfo();


    }
}
