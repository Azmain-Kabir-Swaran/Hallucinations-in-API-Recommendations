package org.example;


import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Main {
    public static void main(String[] args) throws Exception {
        //Create a new blank workbook
        XSSFWorkbook wb = new XSSFWorkbook();

        //Create a new blank sheet
        XSSFSheet sheet = wb.createSheet("Sheet1");

        //Create row object
        XSSFRow row;

        //This data needs to be written to the new cell
        String data = "Hello World";

        //Create a new row and put some cells of it.
        row = sheet.createRow(0);

        //Create a new cell and put some data in the cell
        XSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue(data);

        //Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        wb.write(fileOut);
        fileOut.close();

        //Closing the workbook
        wb.close();
    }
}