package org.example;


import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Font;

public class Main {

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFCellStyle style = workbook.createCellStyle();

        // RGB values for color (R=red, G=green, B=blue, FF=full (255), values range from 0-255)
        byte[] redColor = {255, 0, 0}; //sets the cell style's fill color to red
        XSSFColor red = new XSSFColor(redColor, null, workbook);
        style.setFillForegroundColor(red);
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Create a font
        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) 30);
        font.setFontName("Arial");
        font.setColor(red);
        style.setFont(font);

        System.out.println(style);
    }
}