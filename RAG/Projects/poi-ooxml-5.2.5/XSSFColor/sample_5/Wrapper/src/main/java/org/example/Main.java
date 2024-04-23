package org.example;


import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

public class Main {
    public static void main(String[] args) {
        try {
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFCellStyle cellStyle = wb.createCellStyle();

            XSSFColor color = new XSSFColor(new byte[]{(byte) 0xFF, (byte) 0xA5, 0x00}, null);
            cellStyle.setFillForegroundColor(color);
            cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cellStyle.setBorderBottom(BorderStyle.MEDIUM);
            cellStyle.setBorderTop(BorderStyle.MEDIUM);
            cellStyle.setBorderLeft(BorderStyle.MEDIUM);
            cellStyle.setBorderRight(BorderStyle.MEDIUM);
            cellStyle.setBorderColor(IndexedColors.BLACK.getIndex());

            XSSFSheet sheet = wb.createSheet();
            XSSFRow row = sheet.createRow(0);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue("Sample Cell");
            cell.setCellStyle(cellStyle);

            wb.write(new FileOutputStream("workbook.xlsx"));
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}