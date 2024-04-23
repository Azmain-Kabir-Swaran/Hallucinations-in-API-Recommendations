package org.example;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        try {
            // Path to an Excel file
            FileInputStream excelFile = new FileInputStream("path_to_your_file.xlsx");
            
            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            
            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            // Iterate through each rows one by one
            sheet.iterator().forEachRemaining(row -> {
                // For each row, iterate through all the columns
                row.cellIterator().forEachRemaining(cell -> {
                    // Print the cell value
                    System.out.println(cell.getStringCellValue());
                });
            });

            // Close the workbook
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}