package Class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo2 {
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
        // Replace the below code with a Nested for loop
        int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCells ; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
    }
}
