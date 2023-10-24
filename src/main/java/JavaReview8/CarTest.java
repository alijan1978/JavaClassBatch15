//package JavaReview8;
//
//import JavaReview7.Car;
//import JavaReview7.Tesla;
//
//public class CarTest {
//    public static void main(String[] args) {
//
//        BMW bmw = new BMW("BMW Star", "X7");
//        bmw.start();
//        System.out.println(bmw.drive("very smoothly"));
//        bmw.brake();// comes from BMW subclass
//
//        System.out.println("----- Another object-------------\n");
//
//        Car car = new Car("Toyota", "Highlander") {
//            @Override
//            public void start() {
//
//            }
//        };
//        car.starts();
//        car.drive(180);
//
//        Tesla tesla = new Tesla("Tesla", "Sport", 2023, 350, "Electric", true);
//
//        tesla.start(); // Overridden method from Tesla class
//        tesla.drive(180);// comes from Parent class Car
//        tesla.haveAutoPilot(); // comes from Tesla class
//
//        System.out.println(" Runtime Polymorphism achieved through Method Overriding...\n");
//    // Casting:
//        // Widening and narrowing can be used with primitives
//        // upcasting and down-casting can be used non primitives
//
//        Car bmw1 = new BMW ("BMW", "X77"); // We do Upcasting
//
//        bmw1.drive(100);
//        bmw1.start();
//        bmw1.drive("San Francisco", 120);
//    }
//}
