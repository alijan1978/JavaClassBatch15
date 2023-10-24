package JavaReview11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo1 {
    public static void main(String[] args) {

        String path = "Files/My Family.xlsx";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream); // these 3 lines are for read/writing the file
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");

            int noOfRows = sheet.getPhysicalNumberOfRows(); // this one tells us how many rows we have in this sheet

//            List<Map<String,String>> excelData = new ArrayList<>();
            var excelData = new ArrayList<Map<String,String>>(); // here we created List of Maps so that we can store data, its dynamic
                                                                 // or knows how many rows, columns are there
            Row row0 = sheet.getRow(0); // extract data from row header all the way to the left
                for (int i = 1; i < noOfRows; i++) {   // we started for loop to iterate
                    LinkedHashMap<String,String> rowMap = new LinkedHashMap<>(); //to maintain the insertion order
                     Row row = sheet.getRow(i); // to fetch all the data

            int noOfCells = row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {  // this 2nd loop picks the column 0 header all the way down
                    String key = row0.getCell(j).toString();
    // For excel sheet, the column header is key, and columns under that are values
    // For Row header, its key and all rows to the lefts are values
                    String values = row.getCell(j).toString();
                    rowMap.put(key,values);
                }
                excelData.add(rowMap); // we add our rowMap to our excel data, or we push it to excel
            }

            System.out.println(excelData);

        } catch (Exception e) {  // Exception class is parent of all exceptions
            System.out.println("Please check the path of the file");
        }

    }
}
