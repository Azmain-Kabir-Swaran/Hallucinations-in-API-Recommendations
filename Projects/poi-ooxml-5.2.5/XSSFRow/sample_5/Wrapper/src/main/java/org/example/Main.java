package org.example;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook;
        try {
            FileInputStream excelFile = new FileInputStream("file.xlsx");
            workbook = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow row = sheet.getRow(0); // getting the first row
            if (row != null) {
                int lastCellNum = row.getLastCellNum(); // getting the number of cells in row
                for (int cn = 0; cn <= lastCellNum; cn++) {
                    System.out.println(row.getCell(cn)); // printing the data inside each cell
                }
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}