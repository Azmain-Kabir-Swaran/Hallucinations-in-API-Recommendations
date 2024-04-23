package org.example;


import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        try {
            Workbook wb = new XSSFWorkbook();

            CellStyle cs = wb.createCellStyle();
            cs.setFillForegroundColor(IndexedColors.AQUA.getIndex());
            cs.setFillPattern(CellStyle.BIG_SPOTS);

            Font font = wb.createFont();
            font.setFontHeightInPoints((short) 10);
            font.setFontName("Arial");
            font.setBold(true);

            cs.setFont(font);

            // Use the style to apply formatting to your cells

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}