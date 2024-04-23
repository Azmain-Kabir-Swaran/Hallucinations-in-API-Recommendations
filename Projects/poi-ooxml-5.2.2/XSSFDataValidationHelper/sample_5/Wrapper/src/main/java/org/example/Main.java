package org.example;


import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a workbook and a sheet
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        // Create a helper for the sheet
        XSSFDataValidationHelper helper = new XSSFDataValidationHelper(sheet);

        // Create a constraint for a drop down list
        DataValidationConstraint constraint = helper.createExplicitListConstraint(Arrays.asList("A", "B", "C"));

        // Specify the cells for which to apply the constraint
        CellRangeAddressList regions = new CellRangeAddressList(0, 0, 0, 10);

        // Apply the constraint to the region
        helper.markAsTypeError();
        helper.setValidationConstraint(constraint);
        helper.validate();

        // Write the workbook to disk
        FileOutputStream fileOut = new FileOutputStream("./test.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}