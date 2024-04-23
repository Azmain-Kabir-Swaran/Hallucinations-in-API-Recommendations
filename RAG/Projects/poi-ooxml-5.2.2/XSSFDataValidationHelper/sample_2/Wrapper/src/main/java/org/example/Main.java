package org.example;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.ss.util.CellReference;

public class Main {
    public static void main(String[] args) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");
            CellRangeAddressList regions = new CellRangeAddressList(0);
            regions.add(new CellRangeAddress(0, 0, 0, 0));
            XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
            XSSFDataValidationConstraint validationConstraint = dvHelper.createTextInputConstraint(XSSFDataValidationConstraint.OperatorType.EQUAL, null, null, null, null, null);
            XSSFDataValidation dataValidation = dvHelper.createValidation(validationConstraint, regions);
            dataValidation.setShowDropDown(true);
            sheet.setDataValidationCollection(new XSSFDataValidationCollection(dataValidation));
            CellReference cr = new CellReference("A1");
            sheet.getRow(cr.getRow()).getCell(cr.getCol()).setCellValue(NumberToTextConverter.toText(3));

            workbook.write(new java.io.FileOutputStream("output.xlsx"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}