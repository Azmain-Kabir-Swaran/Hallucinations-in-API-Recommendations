package org.example;


import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Validation");
        Row row = sheet.createRow(1);
        row.createCell(1).setCellValue("Enter your data");

        // Create a datavalidation object and set the validation type to "list"
        XSSFDataValidationConstraint constraint = new XSSFDataValidationConstraint(XSSFDataValidationConstraint.ValidationType.LIST);
        
        CellRangeAddressList addressList = new CellRangeAddressList(1, 1, 1, 1);
        XSSFDataValidationHelper helper = new XSSFDataValidationHelper(constraint, addressList);
        helper.createDataValidation(sheet, CellRangeAddressList.newInstance(0, 0, 1, 1));
        
        // Do something else with the workbook
    }
}