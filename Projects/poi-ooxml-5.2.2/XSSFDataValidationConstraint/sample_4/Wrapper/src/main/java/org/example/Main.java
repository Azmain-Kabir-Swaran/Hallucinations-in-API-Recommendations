package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Validation");

        // Creating a Data Validation object (Constraint), with an Integer type
        XSSFDataValidationConstraint constraint1 = new XSSFDataValidationConstraint(ValidationConstraint.ValidationType.LIST);

        // We create the Operator which will be a Whole number greater than or equal to 100
        XSSFCenterAcrossSelection selection1 = new XSSFCenterAcrossSelection(new XSSFCellRangeAddress(
                4, 4, 2, 2), true);
        constraint1.createExpressionList(selection1, NumberToTextConverter.toText(100));
        //We create a XSSFDataValidation instance
        XSSFDataValidation dataValidation1 = new XSSFDataValidation(constraint1);

        // We set the cell range and bind the Validation with it
        CellRangeAddressList regions = new CellRangeAddressList(3, 3, 1, 1);
        dataValidation1.setCellConstraints(regions);

        // Apply the validation to the dataValidation object
        XSSFRow row = sheet.createRow(3);
        XSSFCell cell = row.createCell(1);
        cell.setCellValue("Data Validation Test Cell");
        sheet.addValidationData(dataValidation1);

        try {
            FileOutputStream fileOut = new FileOutputStream("Validation.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Validation.xlsx written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}