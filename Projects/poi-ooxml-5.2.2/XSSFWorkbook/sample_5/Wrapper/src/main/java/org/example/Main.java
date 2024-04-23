package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // Create a workbook object
        XSSFWorkbook workbook = new XSSFWorkbook();
        
        // Add a sheet to the workbook
        XSSFSheet sheet = workbook.createSheet("Sheet1");
        
        // Creating a new row and putting some data in it
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");
        row.createCell(2).setCellValue("City");

        // Writing the workbook into a file and closing the stream
        FileOutputStream fileOut = new FileOutputStream("output.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        System.out.println("Successfully wrote the data into an Excel file.");
    }
}