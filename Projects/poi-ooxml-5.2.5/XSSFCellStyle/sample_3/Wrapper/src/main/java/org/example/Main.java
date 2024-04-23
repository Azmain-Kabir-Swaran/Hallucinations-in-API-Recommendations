package org.example;


import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        // Create cell style
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
        cellStyle.setFillPattern(CellStyle.BIG_SPOTS);
        cellStyle.setFont(workbook.createFont());

        // Set cell style to a cell
        sheet.getRow(0).createCell(0).setCellStyle(cellStyle);

        // Write the file to the hard disk
        FileOutputStream out = new FileOutputStream("poi-generated-file.xlsx");
        workbook.write(out);
        out.close();
    }
}