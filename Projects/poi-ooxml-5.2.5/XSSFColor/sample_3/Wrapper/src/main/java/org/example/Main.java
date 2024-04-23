package org.example;


import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("My sheet");

        XSSFCellStyle cellStyle = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();

        font.setFontHeightInPoints((short) 10);
        font.setFontName("Arial");
        font.setBold(true);
        font.setColor(new XSSFColor(new java.awt.Color(255, 0, 0))); // Red color
        
        cellStyle.setFont(font);

        // Create a cell and apply the style to it.
        // Here you just show how to apply the style, in real case you need to set value to the cell also
        sheet.getRow(0).createCell(0).setCellStyle(cellStyle); 

        // We don't write the file in real case because we've created in memory, you should write it to disk.
    }
}