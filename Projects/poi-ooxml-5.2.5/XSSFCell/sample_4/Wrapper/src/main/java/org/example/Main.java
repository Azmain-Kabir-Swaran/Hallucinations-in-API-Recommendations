package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "your_excel_file.xlsx";
        
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Assuming that your excel file has a cell which contains the value "Hello"
            XSSFCell cell = sheet.getRow(0).getCell(0);
            String cellValue = cell.getStringCellValue();
            System.out.println(cellValue);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}