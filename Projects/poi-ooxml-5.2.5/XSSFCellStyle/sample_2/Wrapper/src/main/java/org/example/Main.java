package org.example;


import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a new Workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            // Create a Sheet
            XSSFSheet sheet = workbook.createSheet("Sheet 1");

            // Create a cell style
            XSSFCellStyle style = workbook.createCellStyle();
            style.setAlignment(HorizontalAlignment.CENTER, VerticalAlignment.CENTER);

            // Create a Font
            Font font = workbook.createFont();
            font.setFontHeightInPoints((short) 12);
            font.setFontName("Arial");
            style.setFont(font);

            // Apply cell style to cell
            sheet.getRow(0).getCell(0).setCellStyle(style);

            // Write to the output file on disk
            FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}