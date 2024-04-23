package org.example;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Main {

  public static void main(String[] args) {
    Workbook workbook = new XSSFWorkbook();
    
    Sheet sheet = workbook.createSheet("Sheet1");
    
    Row row = sheet.createRow(0);
    row.createCell(0).setCellValue("Hello");
    
    File xlsx = new File("Example.xlsx");

    try(FileOutputStream fileOut = new FileOutputStream(xlsx)) {
        workbook.write(fileOut);
    } catch(IOException e) {
        e.printStackTrace();
    } finally {
        if(workbook != null) {
          try {
              workbook.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
        }
    }
  }
}