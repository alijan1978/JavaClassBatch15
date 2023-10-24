package Class29;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eye-Liner", 12.0);
        makeup.put("Blush-On", 10.0);
        makeup.put("FaceWash", 15.0);

        //To get all the keys, we can use keySet() method from map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for(String make : allKeys){
            System.out.println(make);
        }
        // Delete all the entries from the Map, for which the size of key is greater than 7

        allKeys.removeIf(x-> x.length()>30);
            System.out.println(allKeys);
        System.out.println(makeup);

    }
}
