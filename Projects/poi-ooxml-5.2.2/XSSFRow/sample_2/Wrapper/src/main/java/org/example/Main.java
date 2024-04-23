package org.example;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String filePath = "/path/to/your/excel.xlsx"; // Enter your file path here
        
        try {
            InputStream excelFile = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);

            XSSFSheet sheet = workbook.getSheetAt(0); // Change the 0 to the index of the sheet you want to read
            for (Row row : sheet) {
                for (int i = row.getFirstCellNum(); i <= row.getLastCellNum(); i++) {
                    System.out.println(row.getCell(i).toString());
                }
                System.out.println();
            }
            
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}