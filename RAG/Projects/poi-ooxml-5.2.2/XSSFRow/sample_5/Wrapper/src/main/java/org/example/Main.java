package org.example;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try (FileInputStream file = new FileInputStream("your_workbook.xlsx")) {
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0); // assuming your excel sheet is the first one
            XSSFRow row = sheet.getRow(0); // assuming you want to access the first row

            for(int i=row.getFirstCellNum(); i<= row.getLastCellNum();i++){
                System.out.println(row.getCell(i).getStringCellValue());
            }
        }
    }
}