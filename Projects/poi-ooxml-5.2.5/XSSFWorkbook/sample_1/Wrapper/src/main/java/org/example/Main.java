package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Create a new blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet named "Sheet1"
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        // Create a new row and put some cells in it
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("Hello");

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}