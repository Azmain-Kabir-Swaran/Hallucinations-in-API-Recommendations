package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("./SampleExcelFile.xlsx")) {
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            System.out.println("Active sheet name is: " + sheet.getSheetName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}