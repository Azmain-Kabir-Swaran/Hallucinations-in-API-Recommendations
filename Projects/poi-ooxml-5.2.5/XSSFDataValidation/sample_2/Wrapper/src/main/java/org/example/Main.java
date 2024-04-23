package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {

    public static void main(String[] args) {

        try (XSSFWorkbook workbook = new XSSFWorkbook()) {

            // create a new Sheet
            Sheet sheet = workbook.createSheet("mySheet");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);

            // create a Cell Range
            CellRangeAddressList addressList = new CellRangeAddressList(0, 0, 0, 0);
            
            // create a DataValidation Constraint
            DataValidationConstraint constraint = new DataValidation(addressList);
            
            // create a Data Validation
            DataValidation validation = sheet.createDataValidation();
            validation.addValidation(constraint);

            // add validation to cell
            cell.getCellStyle().setDataValidation(validation);

            // write to file
            try (FileOutputStream out = new FileOutputStream("workbook.xlsx")) {
                workbook.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}