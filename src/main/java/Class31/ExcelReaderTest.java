package Class31;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTest {
    public static void main(String[] args) throws IOException {

//        var excelData=ExcelReader.read();
//        System.out.println(excelData);

        List<Map<String,String>> excelData=ExcelReader.read();
        Map<String,String> firstRow = excelData.get(1);
        System.out.println(firstRow);

    }
}
