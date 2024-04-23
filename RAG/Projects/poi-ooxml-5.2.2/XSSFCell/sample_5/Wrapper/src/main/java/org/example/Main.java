package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Read Excel File
        XSSFWorkbook workbook;

        try {
            FileInputStream excelFile = new FileInputStream("excel.xlsx");
            workbook = new XSSFWorkbook(excelFile);
            excelFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        // Get Sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Loop over all rows
        for(Row row : sheet) {

            // Get first cell from each row
            XSSFCell cell = (XSSFCell) row.getCell(0);

            // Check Cell is not null and is of string type
            if(cell != null && cell.getCellType() == CellType.STRING) {
                // Print string cell value
                System.out.println(cell.getStringCellValue());
            }
        }

        // Close the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}