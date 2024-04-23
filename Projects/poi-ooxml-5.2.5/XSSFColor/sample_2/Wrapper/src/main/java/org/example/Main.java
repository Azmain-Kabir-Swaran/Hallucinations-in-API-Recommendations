package org.example;


import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    
    public static void main(String[] args) {

        try {
            // Create Workbook
            Workbook workbook = new XSSFWorkbook();

            // Create Sheet
            XSSFSheet sheet = ((XSSFWorkbook) workbook).createSheet("sheetName");

            // Create cell style
            XSSFCellStyle cellStyle = ((XSSFWorkbook) workbook).createCellStyle();

            // Create XSSFColor
            XSSFColor color = new XSSFColor(new byte[]{(byte)0, (byte)102, (byte)153}, null, null);

            // Apply the XSSFColor
            cellStyle.setFillForegroundColor(color);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}