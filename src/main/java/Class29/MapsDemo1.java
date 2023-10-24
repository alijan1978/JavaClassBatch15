package Class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Khadija");
        studentsMap.put(2,"Sadeea");
        studentsMap.put(3,"Abdullah");
        studentsMap.put(4,"Zainab");
        studentsMap.put(5,"Tahseen");
        studentsMap.put(6,"Wajia");
        studentsMap.put(7,"Ali");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));// Abdullah with the key 3
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(5));
        System.out.println(studentsMap.containsValue("Ali"));
        System.out.println(studentsMap.remove(7));
        System.out.println(studentsMap);
        System.out.println(studentsMap.remove(3,"Abdullah"));
        System.out.println(studentsMap);
        System.out.println(studentsMap.replace(3,"Abdullah","Diloo jan"));
        System.out.println(studentsMap);



    }
}
