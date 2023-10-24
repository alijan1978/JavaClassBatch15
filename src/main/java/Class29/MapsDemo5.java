package Class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Ali");
        studentsMap.put(2,"Wajia");
        studentsMap.put(3,"Khadija");
        studentsMap.put(4,"Sadeea");
        studentsMap.put(5,"Abdullah");
        studentsMap.put(6,"Zainab");
        studentsMap.put(7,"Tahseen");

        // Remove all the keys from above Map if they are greater than 2
        Set<Integer> keys=studentsMap.keySet();
        keys.removeIf(x-> x>2);
        System.out.println(keys);
        System.out.println(studentsMap);
    }
}
