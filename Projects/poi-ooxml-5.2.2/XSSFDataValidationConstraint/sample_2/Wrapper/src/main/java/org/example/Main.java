package org.example;


import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    private XSSFWorkbook workbook;

    public Main(XSSFWorkbook workbook) {
        this.workbook = workbook;
    }

    public void createDataValidation(String sheetName, String cellReference) {
        XSSFSheet sheet = workbook.getSheet(sheetName);
        XSSFRow row = sheet.getRow(1);
        
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        XSSFDataValidationConstraint dvConstraint = dvHelper.createExplicitListConstraint(new String[]{"1", "2", "3", "4", "5"});
        
        dvConstraint.setPromptTitle("Pick one");
        dvConstraint.setPrompt("Pick one of: 1, 2, 3, 4, 5");
        dvConstraint.setShowErrorBox(true);
        dvConstraint.setErrorStyle(XSSFDataValidationConstraint.WarningStyle.STOP);
        
        dvHelper.validateData(row.getCell(1), dvConstraint);
    }

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Main app = new Main(workbook);
        app.createDataValidation("Sheet1", "A1");
        // ... add code to save workbook ...
    }

}