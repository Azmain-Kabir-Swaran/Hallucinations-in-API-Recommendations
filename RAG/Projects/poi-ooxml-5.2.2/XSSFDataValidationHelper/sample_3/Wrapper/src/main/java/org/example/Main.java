package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.ss.usermodel.DataValidation;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Validation");
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        // Define the cell range where the Data Validation must be applied.
        CellRangeAddressList addressList = new CellRangeAddressList(0, 0, 0, 0);
        DataValidation dataValidation = dvHelper.createValidation(DataValidation.ValidationType.LIST, addressList);
        dataValidation.setErrorStyle(DataValidation.ErrorStyle.STOP);
        dataValidation.createPromptBox("Please choose a value from the list", "Value?");
        // add the list of valid values for Data Validation
        dataValidation.setFormulaList("{1, 2, 3}");
        sheet.addValidationData(dataValidation);
        
        // Write the output to a file
        try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
            workbook.write(fileOut);
        }
    }
}