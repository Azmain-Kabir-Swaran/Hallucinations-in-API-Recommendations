package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a new workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            // Create a new worksheet
            XSSFSheet sheet = workbook.createSheet("Example Sheet");

            // Set value to a cell
            sheet.createRow(0).createCell(0).setCellValue("Hello, World!");

            // Write into file
            try (FileOutputStream fileOut = new FileOutputStream("Example.xlsx")) {
                workbook.write(fileOut);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Your excel file has been written successfully!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}