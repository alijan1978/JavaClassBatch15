//package JavaReview9;
//
//public interface Drawable {
//
//    public static final String TOOL="Pencil"; // we can see that by default it is public static final variable
//    void draw(); // by default, this method is public abstract
//
//  // above code is how Interface used to be before Java 8.
//  // after Java 8, static and default methods were added to the interface
//
//    default void print(){
//        System.out.println("We are drawing object using "+TOOL);
//    }
//
//    static void erase(){
//        System.out.println("All drawings are erasable");
//    }
// }
//
//   abstract class Shape{
//
//   public String color;
//   protected double width, length;
//
//        public Shape(String color, double width, double length) {
//            this.color = color;
//            this.width = width;
//            this.length = length;
//        }
//        public abstract double calculateArea();
//
//    }
//// below Class Rectangle extends Shape interface Parent - Child and also implements Class Drawable interface
//// Below is an example of Multiple Inheritance ... having two parents with the help of interface
//
//    class Rectangle extends Shape implements Drawable {
//
//     public Rectangle(String color, double width, double length) {
//        super(color, width, length);
//    }
//    public double calculateArea(){
//        return length * width;
//    }
//
//    @Override
//        public void draw() {
//            System.out.println("I am drawing a rectangle");
//
//        }
//    }
//
//        class Square implements Drawable{
//
//        public void draw(){
//            System.out.println("I am drawing a square");
//        }
//        }