package org.example;


import java.io.FileInputStream;
import java.io import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("filepath");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFDrawing drawing = sheet.createDrawingPatriarch();

        // Put your code here, for example:
        // drawing.createPicture(...);

        file.close();
    }
}