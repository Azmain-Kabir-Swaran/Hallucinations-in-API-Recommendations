package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {
    public static void main(String[] args) {
        Workbook workbook = WorkbookFactory.create(true);
        Sheet sheet = workbook.createSheet();
        
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Select data");

        CellRangeAddressList regions = new CellRangeAddressList(0, 0, 0, 0);

        XSSFDataValidationHelper dvHelper = (XSSFDataValidationHelper) ((XSSFSheet) sheet).getDataValidationHelper();
        
        XSSFDataValidationConstraint dvConstraint = dvHelper.createExplicitListConstraint(regions, new String[]{"Item1", "Item2", "Item3"});
        dvConstraint.setPromptTitle("Select");
        dvConstraint.setPrompt("Select item from the list");
        dvConstraint.setShowDropDown(true);
        dvConstraint.setErrorStyle(DataValidationConstraint.ErrorStyle.STOP);
        dvConstraint.setShowInputMessage(true);
        dvConstraint.createPromptBox("Enter text");

        dvHelper.validateDataAnnotations(dvConstraint, true);

        workbook.write(new FileOutputStream("path/to/your/file.xlsx"));
        workbook.close();
    }
}