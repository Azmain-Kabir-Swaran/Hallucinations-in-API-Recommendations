package org.example;


import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet");
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        XSSFDataValidationConstraint constraint = dvHelper.createFormulaListConstraint(FormulaCellAutofillType.SERIES, "'Test List'");
        CellRangeAddressList addressList = new CellRangeAddressList(0, 0, 10, 10);
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        dvHelper.validateRegions(constraint, addressList, cellStyle);
    }
}