package Class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo3 {
    public static void main(String[] args) throws IOException {

        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet2 = xssfWorkbook.getSheet("Sheet1");
        int numberOfRows = sheet2.getPhysicalNumberOfRows();
        System.out.println(numberOfRows);

        List<Map<String,String>> excelData=new ArrayList<>(); // created list of Map

        for (int i = 0; i < numberOfRows; i++) {
            Row row = sheet2.getRow(i);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();// Created Map inside the Outer For loop of List

            rowMap.put("Username", row.getCell(0).toString());
            rowMap.put("Password", row.getCell(0).toString());
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}
