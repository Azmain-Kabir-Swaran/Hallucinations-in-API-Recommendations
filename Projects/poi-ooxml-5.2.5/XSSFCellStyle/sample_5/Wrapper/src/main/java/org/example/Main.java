package org.example;


import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in POI");

        int rowNum = 1;
        XSSFRow row = sheet.createRow(rowNum);

        XSSFCellStyle style = workbook.createCellStyle();
        style.setFont(workbook.createFont());
        style.getFont().setFontName("Arial");
        style.getFont().setFontHeightInPoints((short) 10);
        style.setFillForegroundColor(new XSSFColor(java.awt.Color.YELLOW));
        style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);

        row.createCell(0).setCellValue("This is a sample XSSF workbook");
        row.getCell(0).setCellStyle(style);

        row.createCell(1).setCellValue("This is another sample XSSF workbook");

        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();

        System.out.println("Done");
    }
}