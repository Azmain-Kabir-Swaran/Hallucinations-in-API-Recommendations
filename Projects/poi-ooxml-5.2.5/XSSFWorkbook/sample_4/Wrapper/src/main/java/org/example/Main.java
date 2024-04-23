package org.example;


import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Main {
    public static void main(String[] args) {
        try {
            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet("Datatypes in Java");
            Object[][] datatypes = {
                {"int", "Integer Data Type", "2"},
                {"float", "Floating Point Number", "2.2"},
                {"double", "Floating Point Number", "2.2"}
            };

            int rowNum = 0;
            System.out.println("Creating excel");

            for (Object[] datatype : datatypes) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (Object field : datatype) {
                    Cell cell = row.createCell(colNum++);
                    cell.setCellValue(field.toString());
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream("datatypes.xlsx")) {
                workbook.write(outputStream);
                System.out.println("Done");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}