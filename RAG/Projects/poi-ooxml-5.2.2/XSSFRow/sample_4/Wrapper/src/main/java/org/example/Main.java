package org.example;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String excelFilePath = "path_to_excel_file";
        
        try {
            // Creating a FileInputStream object to read the excel file.
            FileInputStream inputStream = new FileInputStream(excelFilePath);
            
            // Creating a workbook object from the above excel file.
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            //Getting the Sheet at index zero
            XSSFSheet sheet = workbook.getSheetAt(0);

            // iterate over the rows one by one
            for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);

                // getting the cell representing the first column of the current row
                XSSFCell cell = row.getCell(0);

                // print the cell's value
                System.out.println(cell.getStringCellValue());
            }

            workbook.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}