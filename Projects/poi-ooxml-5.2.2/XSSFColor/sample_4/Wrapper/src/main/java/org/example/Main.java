package org.example;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

public class Main {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a XSSFSheet
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");

        // Create a XSSFRow
        XSSFRow row;
        row = sheet.createRow(1);

        // Creating a XSSFCellStyle
        XSSFCellStyle cellStyle = workbook.createCellStyle();

        // Create a XSSFColor
        XSSFColor color = new XSSFColor(new byte[] { (byte)0x1E, (byte)0x6F, (byte)0x78 }, new byte[] { (byte)0x1E, (byte)0x6F, (byte)0x78 });

        // Applying the XSSFColor to XSSFCellStyle
        cellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Applying XSSFCellStyle to XSSFCell
        XSSFCell cell = row.createCell(1);
        cell.setCellValue("Created with a color XSSFColor");
        cell.setCellStyle(cellStyle);

        // Creating a file outputstream
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream("users.xlsx");

        // Writing the output to the file
        workbook.write(fileOut);

        // Closing the file outputstream
        fileOut.close();

        // Closing the workbook
        workbook.close();
    }
}