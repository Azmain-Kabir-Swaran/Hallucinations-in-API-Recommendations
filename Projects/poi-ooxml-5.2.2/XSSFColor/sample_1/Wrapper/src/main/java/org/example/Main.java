package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFColor;

public class Main {
    public static void main(String[] args) throws Exception {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("ExcelSheet");
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        XSSFColor myRed = new XSSFColor(new byte[] { (byte) 0xFF, 0x00, 0x00 });
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(myRed.getIndex());
        style.setFillPattern(CellStyle.BDIAG_BLS);
        cell.setCellStyle(style);
        // Do other stuff with cell.
        // workbook.close();
    }
}