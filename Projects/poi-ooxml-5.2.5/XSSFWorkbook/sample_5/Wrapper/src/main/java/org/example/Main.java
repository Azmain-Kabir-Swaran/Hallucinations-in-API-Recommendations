package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        //create workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        
        //create spreadsheet
        XSSFSheet spreadsheet = workbook.createSheet("Workbook");
       
        //create row and put some cells
        XSSFRow row = spreadsheet.createRow(2);
        XSSFCell cell = row.createCell(2);
        
        //put some value in cell
        cell.setCellValue("Hello World");
        
        //write operation
        try {
            FileOutputStream out = new FileOutputStream("C:/myTestFile.xlsx");
            workbook.write(out);
            out.close();
            System.out.println("File created successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //closing
        workbook.close();
    }
}