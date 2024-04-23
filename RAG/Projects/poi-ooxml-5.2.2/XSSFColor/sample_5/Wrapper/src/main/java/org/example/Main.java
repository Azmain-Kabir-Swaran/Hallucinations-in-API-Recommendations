package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFColor;

public class Main {

    public static void main(String[] args) {
        // Creating a Workbook
        Workbook workbook = WorkbookFactory.create(true);
        
        // Accessing a Sheet
        Sheet sheet = workbook.createSheet("MySheet");
        
        // Creating an RGB Color (Red, Green, Blue)
        XSSFColor red = new XSSFColor(new byte[]{(byte) 0xFF, 0, 0}, new byte[]{100, 100, 100, 100});
        
        // Creating a CellStyle
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(red);
        
        // Creating a Row and Cell
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        
        // Adding a value to the Cell and Applying Style
        cell.setCellValue("Hi");
        cell.setCellStyle(style);

        // Writing output file
        try {
            FileOutputStream outputStream = new FileOutputStream("newFile.xlsx");
            workbook.write(outputStream);
            outputStream.close();
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}