package Class17;

public class Dog {

    String name;
    String breed;
    int age;
    double weight;

    public Dog(String dogName, String dogBreed, int dogAge, double dogWeight) {
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        weight=dogWeight;
    }
    public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
}
