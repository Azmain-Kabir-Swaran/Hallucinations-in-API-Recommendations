package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Validation Sheet");

        // Create a DataValidationHelper object to ease with creation of DataValidation objects.
        XSSFDataValidationHelper helper = new XSSFDataValidationHelper(sheet);

        // Create a cell range to validate, in this case from A1 to C3
        CellRangeAddressList addressList = new CellRangeAddressList(0, 2, 0, 2);

        // Create a string input constraint - it requires 3 entries 
        XSSFDataValidationConstraint dvConstraint = new XSSFDataValidationConstraint(XSSFDataValidationConstraint.ValidationType.LIST);
        dvConstraint.setPromptTitle("Enter values");
        dvConstraint.setPrompt("Please select a value from list");
        dvConstraint.setShowInputMessage(true);
        dvConstraint.setShowErrorMessage(true);
        dvConstraint.setIgnoreLeadingBlanks(false);
        dvConstraint.setShowDropDown(true);

        // Add predetermined options 
        dvConstraint.setPromptTitle("Choose from options");
        dvConstraint.setPrompt("Please select from a value from list");
        dvConstraint.setOptions("Value1", "Value2", "Value3");

        XSSFDataValidation validation = helper.createDataValidation(dvConstraint);
        validation.createErrorBox("Error", "Invalid entry");

        validation.setCellRangeList(addressList);

        // Now that the DataValidation object has been created, 
        // you can add it to the worksheet and write it to a file
        sheet.addValidationData(validation);
        try {
            FileOutputStream fileOut = new FileOutputStream("validation.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("validation.xlsx written successfully on disk");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}