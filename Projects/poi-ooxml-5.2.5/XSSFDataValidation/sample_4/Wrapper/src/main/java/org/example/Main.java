package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.DataValidation;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Email validation");

        // create cell style
        CellStyle dataValidationCellStyle = workbook.createCellStyle();
        dataValidationCellStyle.setFillForegroundColor(IndexedColors.AUTOMATIC.getIndex());
        dataValidationCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // create validation
        DataValidation dataValidation = new DataValidation(DataValidation.ValidationType.REGEX);
        dataValidation.setErrorStyle(DataValidation.ErrorStyle.STOP);
        dataValidation.setErrorTitle("Input error");
        dataValidation.setError("Not a valid email address.");
        dataValidation.setPromptTitle("Validation prompt");
        dataValidation.setPrompt("Please enter an email.");

        // regex pattern
        String regexPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z00-9._%+-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regexPattern);

        dataValidation.setRegex(pattern);

        // create helper cells
        CellRangeAddressList addressList = new CellRangeAddressList(0, 10, 0, 0);

        dataValidation.setShowDropDown(true);
        dataValidation.setDisplayAlert(true);
        dataValidation.createConstraint(addressList, dataValidationCellStyle);

        // apply data validation to sheet
        sheet.addValidationData(dataValidation);

        try (FileOutputStream fileOut = new FileOutputStream("validation.xlsx")) {
            workbook.write(fileOut);
        }
    }
}