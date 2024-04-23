package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.ss.util.CellRangeAddressList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

public class Main {

    private static final String XLSX_FILE_PATH = "path_to_your_file.xlsx";

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(new File(XLSX_FILE_PATH));
        Workbook workbook = WorkbookFactory.create(file);

        // Create new sheet with name "Example"
        Sheet sheet = workbook.createSheet("Example");

        // Create list of allowed values
        List<String> allowedValues = Arrays.asList("A", "B", "C", "D");

        // Create a CellRangeAddressList that represents the range of cells we'll apply the validation to
        CellRangeAddressList regions = new CellRangeAddressList(0, 0, 0, 0);

        // Apply the validation to the specified region.
        XSSFDataValidation validation = new XSSFDataValidation(regions, allowedValues);
        XSSFClientAnchor anchor = validation.createClientAnchor();
        anchor.setAnchorType(XSSFDataValidation.AnchorType.STARTS_WITH);
        validation.setShowPromptBox(true);
        validation.setErrorStyle(XSSFDataValidation.ErrorStyle.STOP);

        // Set the validation object to the sheet
        sheet.addValidationData(validation);

        // Write the workbook to the file
        FileOutputStream fileOut = new FileOutputStream(XLSX_FILE_PATH);
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
}