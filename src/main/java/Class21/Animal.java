package Class21;

public class Animal {

    String name;
    String color;
    int age;
    double weight;

    void speak(){
        System.out.println("Animals can speak");
    }
    void eat(){
        System.out.println("All animals eat");
    }
}
    class Cat extends Animal{
    // Here we override speak method in Cat class (from parent to child class)
    void speak(){
        super.speak();
        System.out.println("Cat speaks Meow Meow");
    }
}
    class Dog extends Animal{

}
    class Tester{
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.speak();
        }
    }
