package org.example;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("C:\\path\\to\\your\\excel\\file\\example.xlsx"));

            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (Row row: sheet) {
                if (row.getRowNum() == 0) continue; // Skip first row (headers)

                int index = 0;
                Cell cell = row.getCell(index);
                
                // Do something with the cells, for instance print them
                System.out.println("Cell data: " + cell);
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}