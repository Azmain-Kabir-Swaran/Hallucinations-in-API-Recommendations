package org.example;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Creating workbook object and adding sheet to it
        Workbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = (XSSFSheet) workbook.createSheet("Sheet1");

        // Setting value in cells
        sheet.createRow(0).createCell(0).setCellValue("Hello");
        sheet.createRow(1).createCell(0).setCellValue("World");

        try {
            // Writing the data into the excel file
            FileOutputStream fos = new FileOutputStream("HelloWorld.xlsx");
            workbook.write(fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}