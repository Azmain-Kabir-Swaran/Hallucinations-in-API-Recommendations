package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a new workbook and sheet
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sheet 1");

            // Create a new row and put some cells in it
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hello");

            // Auto-size the column
            sheet.autoSizeColumn(0);

            // Save to file
            FileOutputStream fileOut = new FileOutputStream("data.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            System.out.println("Data saved in data.xlsx.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}