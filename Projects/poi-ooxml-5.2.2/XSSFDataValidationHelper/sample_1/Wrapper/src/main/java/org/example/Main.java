package org.example;


import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        XSSFDataValidationHelper helper = new XSSFDataValidationHelper(sheet);
        XSSFClientAnchor anchor = helper.createClientAnchor();
        anchor.setRow1(2);
        anchor.setRow2(2);
        anchor.setCol1(3);
        anchor.setCol2(3);

        XSSFRichTextString formula1 = new XSSFRichTextString("25");
        XSSFDataValidationConstraint constraint =
                helper.createFormulaListConstraint(formula1);
        constraint.setShowDropList(true);
        constraint.setPromptTitle("Select");
        constraint.setPrompt("Choose value from drop down");

        XSSFDataValidation dataValidation = helper.createDataValidation(anchor);
        dataValidation.addConstraint(constraint);
        sheet.addValidationData(dataValidation);

        // Write output to file
        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        System.out.println("workbook.xlsx written successfully.");
    }

}