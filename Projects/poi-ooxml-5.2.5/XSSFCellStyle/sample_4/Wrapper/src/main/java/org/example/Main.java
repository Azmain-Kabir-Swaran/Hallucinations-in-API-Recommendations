package org.example;


import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Create a Workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a Sheet
        XSSFSheet sheet = (XSSFSheet) workbook.createSheet("Datatypes in Java");

        // Create a Font for styling cells
        Font font = workbook.createFont();
        font.setFontName("Arial");
        font.setBold(true);
        font.setFontHeightInPoints((short) 14);
        font.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);

        // Create a CellStyle for the date format
        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle dateStyle = workbook.createCellStyle();
        dateStyle.setDataFormat(
            createHelper.createDataFormat().getFormat("m/d/yy"));

        // Set the styles in the first row
        sheet.createRow(0).createCell(0).setCellValue("Demonstrates Date Styles");
        XSSFCellStyle dateStyleCellStyle = new XSSFCellStyle();
        dateStyleCellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        dateStyleCellStyle.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("excel_file.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        System.out.println("Excel sheet created successfully");
    }
}