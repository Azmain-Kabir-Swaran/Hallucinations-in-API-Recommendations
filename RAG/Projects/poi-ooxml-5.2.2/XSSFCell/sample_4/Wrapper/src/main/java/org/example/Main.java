package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("inputFilePath");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            XSSFSheet sheet = workbook.getSheet("sheetName");
            XSSFCell cell = sheet.getRow(0).getCell(0); // change this according to cell reference

            if (cell != null) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println("String cell value is: " + cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println("Numeric cell value is: " + cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println("Boolean cell value is: " + cell.getBooleanCellValue());
                        break;
                    case FORMULA:
                        System.out.println("Formula cell value is: " + cell.getCachedFormulaResultType());
                        break;
                    case BLANK:
                        System.out.println("Blank cell");
                        break;
                    default:
                        System.out.println("unknown cell type");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}