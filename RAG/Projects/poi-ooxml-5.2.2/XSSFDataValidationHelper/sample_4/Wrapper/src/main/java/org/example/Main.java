package org.example;


import org.apache.poi.ss.util.*;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.usermodel.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Workbook workbook = WorkbookFactory.create(true);
        Sheet sheet = workbook.createSheet("Data Validation");
        
        // Set up cell range for data validation
        CellRangeAddressList ranges = new CellRangeAddressList(0, 0, 0, 0);
        DataValidationHelper dvHelper = sheet.getDataValidationHelper();
        DataValidationConstraint constraint = dvHelper.createExplicitListConstraint(Arrays.asList("Apple", "Banana", "Cherry"));
        
        // Create validation object
        DataValidation validation = dvHelper.createValidation(constraint, ranges);
        validation.setShowErrorBox(true);
        
        // Add validation to cell
        sheet.addValidationData(validation);
        
        // Write the file to disk
        try {
            workbook.write(new java.io.File("validation.xlsx"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}