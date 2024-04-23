package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Font;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Datatypes in Java");

        CreationHelper createHelper = workbook.getCreationHelper();
        CellStyle textAlignmentCenter = workbook.createCellStyle();
        textAlignmentCenter.setAlignment(HorizontalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 14);
        font.setFontName("Times New Roman");
        font.setItalic(true);
        textAlignmentCenter.setFont(font);

        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("Centered");
        cell.setCellStyle(textAlignmentCenter);

        FileOutputStream fileOut = new FileOutputStream("output.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
}