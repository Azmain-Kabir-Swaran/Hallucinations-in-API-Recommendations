package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
  
  public static void main(String... args) throws IOException {
    // Use try-with-resources to make sure resources are properly closed
    try (FileInputStream file = new FileInputStream("path-to-excel-file")) {
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell cell = sheet.getRow(0).getCell(0); // Assuming cell A1 for example
        
        XSSFCellStyle style = cell.getCellStyle();
        if (style.getFillForegroundXSSFColor() != null) {
            XSSFColor color = style.getFillForegroundXSSFColor();
            System.out.println(color);
        }
    }
  }
}