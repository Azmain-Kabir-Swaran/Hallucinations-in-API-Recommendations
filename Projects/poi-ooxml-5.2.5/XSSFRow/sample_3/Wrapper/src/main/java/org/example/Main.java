package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a new sheet
        Sheet sheet = workbook.createSheet("FirstSheet");

        // Create a row and set it to the first row of the sheet
        Row row = sheet.createRow(0);

        // Create a cell and set it to the first cell of the row
        Cell cell = row.createCell(0);

        // Set the value of the cell to "Hello"
        cell.setCellValue("Hello");

        // Write the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
            workbook.write(fileOut);
        }

        // Close the workbook
        workbook.close();
    }
}