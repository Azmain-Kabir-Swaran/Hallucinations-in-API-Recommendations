package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataValidationHelper;

public class Main {
    public static void main(String[] args) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet();

            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("Choose a value");
            row = sheet.createRow(1);
            row.createCell(0).setCellValue("Option 1");
            row.createCell(1).setCellValue("Option 2");

            ClientAnchor anchor = sheet.getDrawingPatriarch().createAnchor(0, 0, 0, 0, 0, 5, 10, 10);

            DataValidationHelper helper = sheet.getDataValidationHelper();
            DataValidationConstraint constr = helper.createExplicitListConstraint(new String[]{"Option 1", "Option 2"});
            CellRangeAddressList addressList = new CellRangeAddressList(1, 1, 0, 1);
            DataValidation validation = helper.createValidation(constr, addressList);
            validation.createPromptBox("Choose a value", "Choose");
            validation.setShowPromptBox(true);
            validation.setShowErrorBox(true);
            validation.setSuppressDropDownArrow(false);

            anchor.setAnchorType(ClientAnchor.AnchorType.MOVE_DYN_HEIGHT);
            anchor.setRow2(2);
            validation.createAnchor(anchor);

            // Apply the validation to the cell
            sheet.addValidationData(validation);

            workbook.write(new java.io.FileOutputStream("D:\\validation.xlsx"));
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}