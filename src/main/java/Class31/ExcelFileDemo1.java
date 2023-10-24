package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet2 = xssfWorkbook.getSheet("Sheet1");

        int numberOfRows = sheet2.getPhysicalNumberOfRows();

        System.out.println(numberOfRows);

        for (int i = 0; i < numberOfRows; i++) {
            Row row = sheet2.getRow(i);
            System.out.println(row.getCell(0) + " " + row.getCell(1));


        }
    }
}