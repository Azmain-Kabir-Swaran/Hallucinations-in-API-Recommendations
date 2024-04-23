package org.example;


import java.io.FileOutputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;

public class Main {
    public static void main(String[] args) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            CellStyle style = workbook.createCellStyle();
            
            // modify your styles here
            
            style.setAlignment(CellStyle.ALIGN_CENTER);

            FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}