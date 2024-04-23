package org.example;


import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.ValidationType;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Add new sheet
        XSSFSheet sheet = workbook.createSheet("MySheet");
        
        // Create new data validation helper
        DataValidationHelper dvHelper = sheet.getDataValidationHelper();
        
        CellRangeAddressList regions = new CellRangeAddressList(0, 0, 0, 0);
        
        DataValidationConstraint constraint = dvHelper.createTextLengthConstraint(ValidationType.LIST, NumberToTextConverter.toText("1,2,3,4,5,6"));
        
        DataValidation validation = dvHelper.createValidation(constraint, regions);
        
        // Set up the helper
        dvHelper.validateChildren(validation);
        
        // Write into file
        FileOutputStream out = new FileOutputStream("newfile.xlsx");
        workbook.write(out);
        out.close();
    }
}