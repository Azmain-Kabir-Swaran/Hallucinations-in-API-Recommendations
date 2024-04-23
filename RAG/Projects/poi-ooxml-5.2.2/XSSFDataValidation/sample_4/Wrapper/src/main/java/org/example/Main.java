package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creating a Workbook object, based on XLSX file
        Workbook workbook = WorkbookFactory.create(new FileInputStream("path/to/your/file.xlsx"));
        // Get the sheet
        Sheet sheet = workbook.getSheetAt(0);

        // Creating DataValidation object
        DataValidation dataValidation = new XSSFDataValidation(DataValidation.ValidationType.LIST, null);
        dataValidation.setErrorStyle(DataValidation.ErrorStyle.STOP);
        dataValidation.setShowDropDown(true);
        
        // Setting the list of valid values
        String[] validList = {"Yes", "No", "Maybe"};
        dataValidation.setValidation(Arrays.asList(validList));

        // Apply DataValidation object to cell 'A1'
        sheet.addValidationData(dataValidation);

        // Save and close the workbook
        workbook.write(new FileOutputStream("path/to/your/file.xlsx"));
        workbook.close();
    }
}