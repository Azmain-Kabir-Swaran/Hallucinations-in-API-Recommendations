package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        // Workbook object creation
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Creating sheet object
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");

        // Creating a row and putting some cells in it.
        // Rows and cells are 0 index based.
        Row row = sheet.createRow(1);

        // Creating a cell and putting a value in it
        Cell cellA1 = row.createCell(0);
        cellA1.setCellValue(1);
        
        // Creating another cell and putting a value in it
        Cell cellA2 = row.createCell(1);
        cellA2.setCellValue(2);
        
        // Creating another cell and putting a value in it
        Cell cellA3 = row.createCell(2);
        cellA3.setCellValue(3);

        // Creating another row and putting some cells in it.
        Row row2 = sheet.createRow(2);

        // Creating a cell and putting a value in it
        Cell cellB1 = row2.createCell(0);
        cellB1.setCellValue(4);

        // Creating a XSSFRow and fetching cell values
        XSSFRow xssfRow = sheet.getRow(1);
        Cell cell = xssfRow.getCell(0);

        System.out.println(cell.getStringCellValue());
    }
}