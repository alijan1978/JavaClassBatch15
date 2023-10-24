package Class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
      // Location of my Excel file in computer
        String path="Files/Book1.xlsx";
     // When we read the data, we provide FileOutputStream Class... to Navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);
   // XSSFWorkbook is a class that know how to read/write data to an Excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
//  From the Excel file, we need to get the sheet first using below method

//        Sheet sheet1=xssfWorkbook.getSheet("Sheet1"); // we can use XSSFSheet as well
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
// As we are interested in the Row 1, we pass 1 inside the getRow() method
// Rows and Columns are Index based just like Arrays
        Row row=sheet1.getRow(6); // to show Tahseen jan
        Cell cell=row.getCell(0);// Row 6 , column 0

 // All numbers are treated as Doubles (with Decimal) in Excel
        System.out.println(cell);


    }

}
