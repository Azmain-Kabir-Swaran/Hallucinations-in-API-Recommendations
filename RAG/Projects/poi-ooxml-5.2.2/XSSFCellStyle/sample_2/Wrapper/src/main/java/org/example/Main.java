package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

public class Main {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");
        Font font = workbook.createFont();
        XSSFCellStyle style = (XSSFCellStyle)workbook.createCellStyle();
        font.setFontHeight((short)30);
        font.setFontName("Arial");
        style.setFont(font);

        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("Hello World!");
        cell.setCellStyle(style);

        // Write the output to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Your excel sheet has been written successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}