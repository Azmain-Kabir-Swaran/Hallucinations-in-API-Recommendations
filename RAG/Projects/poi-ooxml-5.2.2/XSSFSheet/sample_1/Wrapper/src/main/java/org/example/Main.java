package org.example;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Main {
    public static void main(String[] args) {
        try {
            // Load workbook from file
            Workbook workbook = new XSSFWorkbook(/*file name or input stream*/);
            
            // Get first sheet
            XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);

            // Loop over rows
            for (Row row : sheet) {
                if (row.getRowNum() > 0) {
                    // Handle each row
                }
            }

            // Close the workbook
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}