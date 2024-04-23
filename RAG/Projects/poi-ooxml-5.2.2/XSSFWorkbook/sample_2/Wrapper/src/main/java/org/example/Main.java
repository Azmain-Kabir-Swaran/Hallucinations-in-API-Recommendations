package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        try {
            // Create a new workbook
            XSSFWorkbook workbook = new XSSFWorkbook();
            
            // Create a worksheet
            // Note: the first parameter is the sheet name. The second parameter is the index of the sheet.
            // We choose sheet1 and index is 0.
            workbook.createSheet("Sheet1");

            // Auto-size the columns
            workbook.autoSizeColumn(0);

            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}