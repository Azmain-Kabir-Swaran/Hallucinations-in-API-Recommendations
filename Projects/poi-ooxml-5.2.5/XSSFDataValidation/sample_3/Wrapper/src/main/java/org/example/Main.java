package org.example;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {
    public static void main(String[] args) {
        HSSFWorkbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet("sheet1");

        // Create some data validation
        DataValidationHelper dvHelper = sheet.getDataValidationHelper();
        DataValidationConstraint dvConstraint = dvHelper.createExplicitListConstraint(new String[] {"Red", "Green", "Blue"});
        CellRangeAddressList addressList = new CellRangeAddressList(2, 5, 2, 5);
        DataValidation dataValidation = dvHelper.createValidation(dvConstraint, addressList);

        Cell cell = sheet.getRow(1).createCell(1);
        cell.setCellValue("Please Select Color");

        // Add validation to cell
        sheet.addValidationData(dataValidation);

        // Auto-size the columns
        for (int i = 0; i < 5; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("data_validation.xls");
            wb.write(fileOut);
            fileOut.close();
            System.out.println("data_validation.xls file created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}