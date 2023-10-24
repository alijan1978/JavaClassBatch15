package Class27;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer = new Integer(10);

        int number = integer; // Autoboxing or converting from Wrapper Integer type to int primitive data type
        int number2 = integer.intValue();// Unboxing , converting back from Primitive type int to Wrapper type Integer

        double d = 12.3;
        Double wrapperD = new Double(d); // boxing
        Double wrapperP = d; // autoboxing after Java 8

        Float f = 12f;
        ArrayList <Float> arrayList = new ArrayList<>();
        arrayList.add(12.0f);

        double fg = 12f;


    }
}
