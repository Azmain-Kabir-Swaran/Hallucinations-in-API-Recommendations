package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook wb = new XSSFWorkbook();
        CellStyle style = wb.createCellStyle();
        style.setDataFormat((short) 1);
        
        DataValidationHelper helper = wb.getDataValidationHelper();
        DataValidationConstraint constraint = helper.createExplicitListConstraint(new String[]{"Option1", "Option2"});
        
        CellRangeAddressList addressList = new CellRangeAddressList(0,0,0,1);
        DataValidation dv = helper.createDataValidation(addressList);
        dv.setShowPromptBox(true);
        dv.setPromptTitle("Select an option");
        dv.setPrompt("please select");
        dv.setShowErrorBox(true);
        dv.setErrorStyle(CellStyle.SOLID_FOREGROUND);
        dv.setSuppressDropDownArrow(false);
        dv.setPromptBoxPosition(DataValidation.PromptBoxPosition.BOTTOM_CENTER);
        dv.setAllowBlankTarget(false);
        dv.setShowHelpMarker(true);
        dv.setErrorTitle("Input error");
        dv.setError("Please select from the list");
        dv.setHelpText("Select an item from the list");
        dv.setPromptBoxBorderColor(CellStyle.MEDIUM_SPAN);
        dv.setPromptBoxBorderStyle(CellStyle.BORDER_THIN);
        dv.setPromptBoxBorderColor(CellStyle.BLACK_COLOR_INDEX);
        dv.setHelpTextRows((short)5);
        dv.setHelpTextColumns((short)3);
        dv.setErrorButtonText("Enter");
        dv.setShowDropDown(true);
        dv.setShowInputMessage(true);
        dv.setShowErrorMessage(true);
        dv.setFormula1(constraint);
        
        wb.write(new FileOutputStream("d:/valid.xlsx"));
    }
}