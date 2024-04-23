package org.example;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.ValidationData;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a File object for a file "example.xlsx".
        File excelFile = new File("example.xlsx");

        // Create FileInputStream object for excelFile and pass it to the XSSFWorkbook constructor.
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Create a new sheet called "ExampleSheet".
        Sheet sheet = workbook.createSheet("ExampleSheet");

        // Create a row and put some cells in it.
        Row row = sheet.createRow(2);
        Cell cellA1 = row.createCell(0);
        Cell cellB1 = row.createCell(1);

        // Create data validation for cellA1 and cellB1.
        DataValidation dataValidationA1 = new DataValidation(ValidationConstraint.LIST, new CellRangeAddressList(2, 2, 0, 0));
        DataValidation dataValidationB1 = new DataValidation(ValidationConstraint.LIST, new CellRangeAddressList(2, 2, 1, 1));

        dataValidationA1.setShowDropList(true);
        dataValidationB1.setShowDropList(true);

        ValidationData validationData = dataValidationA1.getValidation();
        validationData.setPromptTitle("Enter your choice");
        validationData.setPrompt("Select an option from the dropdown list");
        validationData.setShowPromptMessage(true);

        validationData.addFormulaList("DataValidationHelper");

        dataValidationA1.validate(new XSSFSheet(sheet));
        dataValidationB1.validate(new XSSFSheet(sheet));

        // Write the output to a file called "example2.xlsx".
        FileOutputStream out = new FileOutputStream(new File("example2.xlsx"));
        workbook.write(out);
        workbook.close();
        out.close();
    }
}