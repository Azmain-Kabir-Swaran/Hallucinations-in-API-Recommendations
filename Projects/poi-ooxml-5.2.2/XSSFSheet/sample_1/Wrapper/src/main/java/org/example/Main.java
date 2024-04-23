package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("First Sheet");
        
        XSSFRow row = sheet.createRow(1);
        XSSFCell cell = row.createCell(1);
        
        cell.setCellValue("Hello, world!");
        
        // Do some operations here on the `XSSFSheet` API...

        // Don't forget to close the workbook when you're done to free up resources
        workbook.close();
    }
}