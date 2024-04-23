package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFCrossThreadBoundary;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("input.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);

        // This will add data validation to cell A1 with a list of values: A, B, C
        String[] list = {"A", "B", "C"};
        XSSFDataValidationHelper helper = new XSSFDataValidationHelper(sheet);
        helper.createDataValidation().validate(ValidationConstraint.createExplicitListConstraint(list));

        XSSFClientAnchor anchor = helper.createClientAnchor();
        anchor.setAnchorType(XSSFCrossThreadBoundary.SourceAnchorType.MOST_RECENTLY_USED_FORMATTING);

        CellRangeAddressList regions = new CellRangeAddressList(0, 0, 0, 0);

        helper.markAsPartOfFormulaGroup();

        helper.setFormulaList(anchor, regions);
        helper.validate(ValidationConstraint.createExplicitListConstraint(list));

        fis.close();

        FileOutputStream fileOut = new FileOutputStream("output.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        System.out.println("Data validation added successfully");
    }
}