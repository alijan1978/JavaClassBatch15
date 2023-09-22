package Class20;

public class Area {
/*
Create 1 class in which to create a method that will calculate the area of Method, name must be called calculateArea:
    - Rectangle
    - Square
    Use separate class to test the code.
 */
    void calculateArea(double length, double width){
        System.out.println("Area of rectangle is "+(length * width));
    }
    void calculateArea(double side){
        System.out.println("Area of Square is "+(side * side));
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea(10);//we have double datatype (line 13), java does up casting smaller value to bigger
        area.calculateArea(10, 10);
    }

}
