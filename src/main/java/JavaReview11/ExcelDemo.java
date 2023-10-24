package JavaReview11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDemo {
    public static void main(String[] args) {

        String path = "Files/My Family.xlsx";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
            Row row = sheet.getRow(6); // fetch the specific data based on indexes
            System.out.println(row.getCell(2)); // to get Zainab's age 6 .. apachi poi prints it as double type
        } catch (Exception e) {  // Exception class is parent of all exceptions
            System.out.println("Please check the path of the file");
        }

    }
}
