package org.example;


import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("New Sheet");
        XSSFDrawing drawing = sheet.createDrawingPatriarch();

        // Now, you can manipulate the drawing object as per your requirement.

        // Remember to close the workbook after use.
        workbook.close();
    }
}