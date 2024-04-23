package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("path/to/your/file.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0); // assuming it is the first sheet

        for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {
            Cell cell = sheet.getRow(i).getCell(0); // assuming each row starts with a value
            if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                System.out.println(cell.getStringCellValue());
            }
        }
        
        workbook.close();
        file.close();
    }
}