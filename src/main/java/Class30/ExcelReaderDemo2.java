package Class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {

        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");

        int numberOfRows=sheet1.getPhysicalNumberOfRows();  // getPhysicalNumberOfRows().. it returns the number of rows that actually contain the data im Excel file
            for (int i = 0; i < 4 ; i++) {  // We need one Loop to go through all the Rows one by one
            Row row = sheet1.getRow(i);
        int numberOfCells=row.getPhysicalNumberOfCells();   // getPhysicalNumberOfCells(); ... here tells us how many cells contain the data
        for (int j = 0; j < 4 ; j++) { // to go through all the cells from each row
            Cell cell=row.getCell(j);
                System.out.print(cell+" ");

        }
            System.out.println();



        }
    }
}
