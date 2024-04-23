package org.example;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Validation");
        
        Drawing drawing = sheet.createDrawingPatriarch();
        ClientAnchor anchor = drawing.createAnchor(0, 0, 0, 0, 2, 2, 5, 5);
        DataValidationHelper helper = new DataValidationHelper(sheet);
        DataValidationConstraint constraint = DataValidationConstraint.createExcelListValidationConstraint(new String[]{"Choice1", "Choice2", "Choice3"});
        
        CellRangeAddressList addressList = new CellRangeAddressList(2, 5, 2, 5);
        DataValidation dv = helper.createDataValidation(addressList);
        
        dv.setShowDropDown(true);
        dv.setErrorStyle(DataValidation.ErrorStyle.STOP);
        dv.setPromptTitle("Pick one");
        dv.setPrompt("Please pick an option");
        
        dv.addValidation(constraint);
        
        FileOutputStream fileOut = new FileOutputStream("output.xlsx");
        wb.write(fileOut);
        fileOut.close();
        wb.close();
    }
}