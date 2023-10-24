package Class30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {

        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("Name", "Mohammad Ali");
        row1.put("LastName", "Naim");
        row1.put("Age", "45");
        row1.put("City", "San Jose");
        row1.put("State", "California");

        LinkedHashMap<String,String> row2 = new LinkedHashMap<>();
        row2.put("Name", "Wajia");
        row2.put("LastName", "Ali");
        row2.put("Age", "36");
        row2.put("City", "San Jose");
        row2.put("State", "California");

        LinkedHashMap<String,String> row3 = new LinkedHashMap<>();
        row3.put("Name", "Khadija");
        row3.put("LastName", "Ali");
        row3.put("Age", "17");
        row3.put("City", "San Jose");
        row3.put("State", "California");

        // Now we combine all 3 above list in List interface
        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);

    }
}
