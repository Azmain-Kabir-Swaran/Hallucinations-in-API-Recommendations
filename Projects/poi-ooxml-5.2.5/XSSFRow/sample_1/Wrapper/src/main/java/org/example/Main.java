package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = null;
        try {
            FileInputStream file = new FileInputStream("D:/Sample.xlsx");
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFRow row;

        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
            row = sheet.getRow(i);
            for(int j=row.getFirstCellNum();j<row.getLastCellNum();j++) {
                System.out.print(row.getCell(j).toString() + "\t\t");
            }
            System.out.println();
        }

    }
}