package JavaReview6;

public class Flower {

// attributes , properties\
    // belows are instance variable, defined inside the class, but outside of main method
    // to call it, we need to create object of it's class.

    static boolean pretty=true; // using static variable here
    String color, type, name;
    int price;

    // behavior , method

    void smell(){
           System.out.println(name+" Flower smells good");
    }
    void bloom(){
        System.out.println(name+" Flower blooms");
    }
    void grow(){
        System.out.println(name+" Flower grows");
    }



}
