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

public class ExcelReader {

    public static List<Map<String,String>> read() throws IOException {

        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet2 = xssfWorkbook.getSheet("Sheet1");
        int numberOfRows = sheet2.getPhysicalNumberOfRows();
        List<Map<String,String>> excelData=new ArrayList<>(); // created list of Map
        Row row0=sheet2.getRow(1);
        for (int i = 1; i < numberOfRows; i++) {
            Row row1 = sheet2.getRow(i);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();// Created Map inside the Outer For loop of List

            for (int j = 0; j < row1.getPhysicalNumberOfCells(); j++) {
                rowMap.put( row0.getCell(j).toString(), row1.getCell(j).toString());
            }
            excelData.add(rowMap);
        }
            return excelData;
    }
}
