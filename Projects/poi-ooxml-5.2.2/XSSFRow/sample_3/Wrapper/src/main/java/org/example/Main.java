package org.example;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("sample.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            if (row == null) {
                continue;
            }
            System.out.println("Row: " + i);
            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }
    }
}