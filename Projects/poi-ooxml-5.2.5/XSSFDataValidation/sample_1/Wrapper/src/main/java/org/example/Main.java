package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidation;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DataValidationExample");

        DataValidation dataValidation = new DataValidation(DataValidation.Constraint.LIST);
        dataValidation.setShowDropDown(true);
        dataValidation.setPromptTitle("Choose One");
        dataValidation.setPrompt("Pick a value");
        dataValidation.setShowPromptMessage(true);
        
        // Set a list of allowed values
        dataValidation.setExplicitList(new String[]{"Value1", "Value2", "Value3"});

        DataValidationConstraint constraint = dataValidation.createConstraint();
        constraint.enableInputMessage("Please Enter or Pick a Value");
        constraint.setShowDropDown(true);
        constraint.setErrorStyle(DataValidationConstraint.ErrorStyle.STOP);
        constraint.setShowErrorBox(true);
        dataValidation.addConstraint(constraint);

        // Apply the validation to cell range A1:A10 on the sheet
        DataValidationHelper helper = sheet.getDataValidationHelper();
        helper.addValidationData(dataValidation);

        try {
            FileOutputStream fileOut = new FileOutputStream("output.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("DataValidationExample.xlsx written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}