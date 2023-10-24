//package JavaReview7;
//
//public abstract class Car {
//
//   protected String make, model;
//    int year, horsePower;
//
//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
//
//    Car(String make, String model, int year, int horsePower) {
//        this(make, model); // this() calling the constructor of current class
//        this.year = year;
//        this.horsePower = horsePower; // accessing the class instance variable
//    }
//
//    public void starts() {
//        System.out.println(make + " starts engine");
//    }
//
//    public void drivesFast(int speed) { // method with parameters
//        System.out.println(make + " drives with the speed of " + speed);
//    }
//
//
//    // Same class can have 2 or more methods with the same name, called Method Overloading
///*  by using different number of parameters / or method signature is different ... drive( )
//    by using different type of parameters
//    by Sequence
//    In overloading we don't care about return type (can be changed) or access modifiers ( can be different)
// */
//    public void drive(int speed) {
//
//        System.out.println(make + " drive with the speed = " + speed);
//    }
//
//    public String drive(String destination, int speed) {
//
//        System.out.println(make + " drives " + destination + speed);
//        return destination;
//    }
//
//    public abstract void start();
//}