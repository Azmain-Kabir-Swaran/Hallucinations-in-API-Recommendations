package org.example;


import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Excel file to open
        String excelFilePath = "example.xlsx";

        try {
            // Open the workbook
            FileInputStream fis = new FileInputStream(excelFilePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            // Get the first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each row in the sheet
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Depending on the cell type, cast cell accordingly
                    switch (cell.getCellTypeEnum()) {
                        case STRING:
                            String stringCellValue = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            Double numericCellValue = cell.getNumericCellValue();
                            break;
                        case BOOLEAN:
                            Boolean booleanCellValue = cell.getBooleanCellValue();
                            break;
                        case FORMULA:
                            String formulaCellValue = cell.getCellFormula();
                            break;
                        default:
                    }
                }
            }

            // Close the workbook
            workbook.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}