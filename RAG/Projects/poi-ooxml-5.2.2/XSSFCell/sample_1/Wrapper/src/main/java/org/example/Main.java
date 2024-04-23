package org.example;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a new XSSFWorkbook object and load an existing excel file.
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("path_to_your_excel_file.xlsx"));

        // Create a new XSSFSheet object and get the first sheet from the workbook.
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Create a new XSSFRow object and get the first row from the sheet.
        XSSFRow row = sheet.getRow(0);

        // Create a new XSSFCell object and get the first cell from the row.
        XSSFCell cell = row.getCell(0);

        // Now you can use the XSSFCell object to access various properties and methods.
        // For example, you can get the cell value as a string with the getStringCellValue method.
        String cellValue = cell.getStringCellValue();

        System.out.println(cellValue);

        // Remember to close the workbook to release resources.
        workbook.close();
    }
}