package org.example;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {

    public static void main(String[] args) throws Exception {
        //Create blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook(); 

        //Create sheet
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");

        // Create a Row
        XSSFRow row;

        // Create Cell Reference
        XSSFCell cell;

        // This data needs to be written to new rows starting from row 4
        int startingRowNumber = 4;

        // Create a row and put some cells in it. Rows 1 and 3 are
        // created manually, row 2 and 4 are obtained from above row
        row = sheet.createRow(startingRowNumber++);

        // Create a validation that applies to the whole column
        XSSFDataValidationConstraint constraint = new XSSFDataValidationConstraint(XSSFDataValidationConstraint.ValidationType.LIST, null, null, "$A$4:$A$1048576");

        XSSFDataValidation validation = new XSSFDataValidation(constraint);

        // We will add a date type condition to the data validation
        XSSFDataValidationHelper helper = XSSFDataValidationHelper.newInstance(validation);
        helper.createDataValidation(constraint, cell);

        sheet.addValidationData(validation);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("books.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}