package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        // Create an empty workbook
        XSSFWorkbook workbook = null;

        // Create a FileInputStream object
        FileInputStream fis = null;
        
        try {
            // Create a FileInputStream, pass the path of your file
            fis = new FileInputStream("path/to/file.xlsx");

            // Create an XSSFWorkbook object
            workbook = new XSSFWorkbook(fis);
            
            // Selecting the first Sheet 
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Getting the cell value by specifying its position in the sheet, in this case it's (0,0)
            String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();

            // Printing the cell value
            System.out.println(cellValue);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Closing the I/O File which is managing the file pointer
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}