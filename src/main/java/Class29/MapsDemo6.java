package Class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Ali");
        studentsMap.put(2,"Wajia");
        studentsMap.put(3,"Khadija");
        studentsMap.put(4,"Sadeea");
        studentsMap.put(5,"Abdullah");
        studentsMap.put(6,"Zainab");
        studentsMap.put(7,"Tahseen");

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        //Remove all values which contains letter 'i'
        values.removeIf(x-> x.contains("i"));
        System.out.println(studentsMap);



    }
}
