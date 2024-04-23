package org.example;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Main {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatype Demo");
        
        // Create a row and put some cells in it. Rows are 0 based.
        Row row = sheet.createRow(1);

        // Create some cells and put a message in them.
        Cell cell = row.createCell(2);
        cell.setCellValue("Hello");

        // Create helper
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);

        // Create a validation constraint and set it to the cell
        CellRangeAddressList addressList = new CellRangeAddressList(1, 1, 2, 2);
        DataValidationConstraint dvc = dvHelper.createTextConstraint();
        dvc.enableWarning(true);
        dvc.setPromptTitle("Type your text");
        dvc.setPrompt("Type a text");
        dvc.setShowPromptMessage(true);
        dvc.setShowErrorBox(true);
        dvc.setTextOperator(Operator.STRING_OP(Operator.OPERATOR_BLANK));

        XSSFDataValidation dataValidation = new XSSFDataValidation(addressList, dvc);
        cell.setDataValidation(dataValidation);
        
        // Set the width of the cells to make them larger
        sheet.setColumnWidth(2, 7000);

        // Write the output to a file
        try (FileOutputStream fileOut = new FileOutputStream("workbook.xlsx")) {
            workbook.write(fileOut);
        }
    }
}