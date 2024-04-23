package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        XSSFCell cell = sheet.getRow(0).createCell(0);
        cell.setCellValue("Hello World");

        workbook.write(System.out);
    }
}