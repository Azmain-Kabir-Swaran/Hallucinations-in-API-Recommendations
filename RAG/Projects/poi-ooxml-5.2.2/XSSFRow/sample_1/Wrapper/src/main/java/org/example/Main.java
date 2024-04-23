package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");

        Object[][] dataTypes = {
                {"Datatype", "Type", "Size"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"byte", "Primitive", 1},
                {"char", "Primitive", 2},
                {"boolean", "Primitive", 1}
        };

        int rowNum = 0;
        System.out.println("Writing data on the worksheet now.");

        for (Object[] datatype : dataTypes) {
            rowNum++;
            int colNum = 0;

            for (Object field : datatype) {
                sheet.getRow(rowNum).createCell(colNum++).setCellValue(field.toString());
            }
        }
        try {
            FileOutputStream out = new FileOutputStream("datatypes.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("Excel written successfully..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}