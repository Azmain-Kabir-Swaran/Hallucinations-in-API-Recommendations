package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("your_file.xlsx"); // change this to your file path
            XSSFSheet sheet = workbook.getSheetAt(0);  // change 0 to the sheet index you want to read from
            
            for (Row row : sheet) {
                XSSFRow xssfRow = (XSSFRow) row;
                System.out.println("Row Num: " + xssfRow.getRowNum() + " ,Row height : " + xssfRow.getHeight() + " , Row Is Formatted : " + xssfRow.getZeroHeight());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}