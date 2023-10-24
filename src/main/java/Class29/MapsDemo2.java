package Class29;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String,Double> fruits=new HashMap<>();
        fruits.put("Apple", 1.99);
        fruits.put("Banana", 2.99);
        fruits.put("Orange", 1.5);
        fruits.put("Mango", 2.0);
        fruits.put("Kiwi", 1.0);
        fruits.put("Apple", 5.99);// if the same value duplicate you put, it will replace that value of other duplicate
        fruits.put(null,null);// it will retain the last value

        System.out.println(fruits);

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eye-Liner", 12.0);
        makeup.put("Blush-On", 10.0);
        makeup.put("FaceWash", 15.0);

        // Combine all the values of both Map together

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruits);
        groceries.putAll(makeup);

        System.out.println(groceries);

    }
}
