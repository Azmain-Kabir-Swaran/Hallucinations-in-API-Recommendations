package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        // Create a data validation
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);

        XSSFDataValidationConstraint dvConstraint = new XSSFDataValidationConstraint(XSSFDataValidationConstraint.ValidationType.LIST, null, null);
        dvConstraint.addInteger(1);
        dvConstraint.addInteger(2);

        CellRangeAddressList addressList = new CellRangeAddressList(0,0,0,10);

        XSSFClientAnchor anchor = dvHelper.createClientAnchor();
        anchor.setDuplicateValidations(false);
        XSSFDataValidation dataValidation = dvHelper.createDataValidation(dvConstraint, anchor, addressList);

        sheet.addValidationData(dataValidation);

        // Write the output to a file
        try (FileOutputStream fileOut = new FileOutputStream("worksheet.xlsx")) {
            workbook.write(fileOut);
        }
    }
}