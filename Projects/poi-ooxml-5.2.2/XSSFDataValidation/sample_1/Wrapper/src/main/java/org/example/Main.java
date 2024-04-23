package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.*;

public class Main {

    public static void main(String[] args) {
        try {
            // Creating a new Workbook
            XSSFWorkbook workbook = new XSSFWorkbook();

            // Creating a Worksheet
            XSSFSheet sheet = workbook.createSheet("Sheet1");

            // Adding the Validation Constraints
            XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
            XSSFDataValidationConstraint dvConstraints = dvHelper.createExplicitListConstraint(new String[]{"Test1", "Test2"});
            CellRangeAddress range = new CellRangeAddress(0, 0, 0, 1);
            XSSFDataValidation validation = dvHelper.createValidation(dvConstraints, range);
            validation.setShowErrorBox(true);
            validation.setErrorStyle(ValidationCellStyle.STOP);
            sheet.addValidationData(validation);

            // Saving the Workbook
            try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
                workbook.write(fileOut);
            }

            // Creating DataValidation Cell in the given cell.
            XSSFRow row = sheet.createRow(1);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue("Test1");
            CellStyle style = workbook.createCellStyle();
            style.setDataValidation(new XSSFDataValidation(new CellRangeAddress(1, 1, 0, 0), dvConstraints));
            cell.setCellStyle(style);

            try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
                workbook.write(fileOut);
            }

            // Checking the entered value meets the constraints.
            XSSFRow row2 = sheet.createRow(2);
            XSSFCell cell2 = row2.createCell(0);
            cell2.setCellValue("Test3");
            checkValidation(workbook, cell2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkValidation(Workbook workbook, Cell cell) {
        if(cell.getCellType().equals(CellType.STRING)) {
            String value = cell.getStringCellValue();
            DataValidation dataValidation = DataValidation.addIndirectValidation((DataValidationConstraint) workbook.getValidationHelper().createExplicitListConstraint(new String[]{"Test1", "Test2"}), cell);
            if(dataValidation.validate(new DataValidationHelper.Context(cell.getSheet(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow(), cell.getRow())).equals("True")){
                cell.setCellStyle((CellStyle) workbook.createCellStyle());
            } else {
                cell.setCellStyle((CellStyle) workbook.createCellStyle());
                cell.getCellStyle().setFillForegroundColor(IndexedColors.RED.getIndex());
                cell.getCellStyle().setFillPattern(FillPatternType.SOLID_FOREGROUND);
            }
        }
    }
}