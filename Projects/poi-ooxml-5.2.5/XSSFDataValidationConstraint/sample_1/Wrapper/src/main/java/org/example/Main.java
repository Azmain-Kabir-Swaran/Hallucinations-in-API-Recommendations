package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a workbook and a sheet
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("Datatype");

        // Create cells
        Cell cell;
        for (int i = 0; i < 15; i++) {
            row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(i + 1);
        }

        // Create Data Validation
        DataValidation dv = sheet.getDataValidationHelper().createFormulaListValidator(DataValidationConstraint.createExplicitListConstraint(new String[] {
                NumberToTextConverter.toText(1),
                NumberToTextConverter.toText(2),
                NumberToTextConverter.toText(3),
                NumberToTextConverter.toText(4),
                NumberToTextConverter.toText(5),
                NumberToTextConverter.toText(6),
                NumberToTextConverter.toText(7),
                NumberToTextConverter.toText(8),
                NumberToTextConverter.toText(9),
                NumberToTextConverter.toText(10)});

        // Create a constraint and set it to the cell range
        dv.setShowPromptBox(true);
        dv.setPromptTitle("Pick from list");
        dv.setPrompt("pick one:");
        dv.createPromptBox("Pick one");
        dv.setErrorStyle(DataValidation.ErrorStyle.STOP);
        dv.setShowErrorBox(true);

        CellRangeAddress cra = new CellRangeAddress(0, 14, 0, 0);
        dv.addValidation(cra);
        sheet.addDataValidation(dv);

        // AutoSize the columns
        for (int i = 0; i < 1; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        wb.write(fileOut);
        fileOut.close();

        // Closing the workbook
        wb.close();
    }
}