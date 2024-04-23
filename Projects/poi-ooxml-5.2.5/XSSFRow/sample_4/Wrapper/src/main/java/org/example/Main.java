package org.example;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Row;

public class Main {

    public static void main(String[] args) {
        XSSFRow row = null; // create a new row

        row.getRowStyle(); // retrieves the style of this row
        row.createCell(0).setCellValue("Hello World"); // creates a new cell with a string value

        row.setRowStyle(rowStyle); // sets the style for the row
        row.getCell(0).getStringCellValue(); // retrieves the string value stored in the cell at the given index
    }
}