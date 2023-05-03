import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;


public class TestCode {


    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Saleem\\Desktop\\Cloned2\\Saleem_Sadat_teladoc_challenge\\Data\\excelData.xlsx");
        String excelFilePath = "C:\\Saleem\\Desktop\\Cloned2\\Saleem_Sadat_teladoc_challenge\\Data\\excelData.xlsx";

        FileInputStream inputStream = new FileInputStream(excelFilePath); // here we are calling the constructor of FileInputStream and the Constructor takes a parameter.


        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1"); // getting sheet from the workbook
        //Row row = sheet.getRow(1);
        //Cell cell = row.getCell(1);



       /*
Iterate over the rows in the worksheet and retrieve the data:
 */

        Iterator iterator = sheet.iterator();

        while (iterator.hasNext()) { // checking if there is next record

            XSSFRow row = (XSSFRow) iterator.next();
            Iterator cellIterator=row.cellIterator();

            while (cellIterator.hasNext()){
                XSSFCell cell =(XSSFCell) cellIterator.next();

                switch (cell.getCellType()){

                    case STRING: System.out.println(cell.getStringCellValue()); break;
                    case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
                    case BOOLEAN: System.out.println(cell.getNumericCellValue()); break;
                }
                System.out.print("  | ");
            }

            System.out.println();

        }
    }


    }




