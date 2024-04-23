package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new workbook with an existing .xlsx file
        try (InputStream fis = new FileInputStream("src\\main\\resources\\sample.xlsx")) {
            // Create a workbook using the file input stream.
            Workbook workbook = new XSSFWorkbook(fis);

            // Access the sheet "Sheet1" in the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Loop over the cells to fetch all the data
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.println(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            System.out.println(cell.getCellFormula());
                            break;
                    }
                }
            }
        }
    }
}