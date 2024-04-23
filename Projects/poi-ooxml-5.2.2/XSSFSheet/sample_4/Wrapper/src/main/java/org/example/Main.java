package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");

        Object[] datatypes = {
                "Primitives", "Autoboxing", "var"
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            Cell cell = row.createCell(colNum);
            cell.setCellValue(datatype.toString());
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("./excel/primitives.xlsx");
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}