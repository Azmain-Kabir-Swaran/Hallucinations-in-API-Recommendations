package org.example;


import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a new worksheet
        XSSFSheet sheet = workbook.createSheet("Datatypes in POI");

        // Create a new cell style
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
        cellStyle.setBorderRight(CellStyle.BORDER_THIN);
        cellStyle.setBorderTop(CellStyle.BORDER_THIN);

        // Set the style in the cell
        sheet.getRow(0).createCell(0).setCellStyle(cellStyle);

        // Save the workbook to a file
        try (FileOutputStream outputStream = new FileOutputStream("style_test.xlsx")) {
            workbook.write(outputStream);
        }
    }
}