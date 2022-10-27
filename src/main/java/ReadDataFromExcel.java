import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcel {
//Read data from Excel file – 5 columns but all rows in the file
    public static void main(String[] args) throws IOException {
        File file =    new File(System.getProperty("user.dir")+ "//convertcsv.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        Workbook book = new XSSFWorkbook(inputStream);
        Sheet sheet = book.getSheet("sheet 1");
        int rowCount = sheet.getLastRowNum();

        for (int i = 0; i < rowCount+1; i++) {

            Row row = sheet.getRow(i);

            //Create a loop to print cell values in a row

            for (int j = 0; j < 5; j++) {

                //Print Excel data in console for 5 columns

                System.out.print(row.getCell(j).getStringCellValue()+"|| ");

            }

            System.out.println();
        }
        inputStream.close();

    }
}
