package org.example;


import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Main {
    public static void main(String[] args) throws Exception {
        //create new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        //create new sheet
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        //define two cells to use as drop down list options, e.g., option1 and option2
        sheet.getRow(0).createCell(0).setCellValue("option1");
        sheet.getRow(1).createCell(0).setCellValue("option2");

        //specify cell range on which the drop down list will be applied
        CellRangeAddressList addressList = new CellRangeAddressList(0, 1, 0, 0);

        //create a data validation, specify validation type DV_LIST
        DataValidation validation = sheet.getDataValidationHelper().createDataValidation(addressList);
        validation.setShowDropDown(true);
        validation.setPromptTitle("Options");
        validation.setPrompt("Please select from the list");

        //set options
        validation.addValidation(new CellRangeAddressList(0, 1, 0, 0));

        //write back to the file
        try(OutputStream fileOut = new FileOutputStream("/path/to/file/output.xlsx")) {
            workbook.write(fileOut);
        }
    }
}