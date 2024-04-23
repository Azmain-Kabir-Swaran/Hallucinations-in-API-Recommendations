package org.example;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        String excelFilePath = "/path_to_your_excel_file";
        FileInputStream inputStream = new FileInputStream(excelFilePath);

        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        //Iterate through each rows one by one
        sheet.iterator().forEachRemaining(row -> {

            //For each row, iterate through all the columns
            row.cellIterator().forEachRemaining(cell -> {

                //Check the cell type and format accordingly
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println("[STRING] " + cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println("[NUMERIC] " + cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println("[BOOLEAN] " + cell.getBooleanCellValue());
                        break;
                    case BLANK:
                        System.out.println("[BLANK] ");
                        break;
                    default:
                        System.out.println("[Unknown Type]");
                }
            });
        });

        workbook.close();
    }
}