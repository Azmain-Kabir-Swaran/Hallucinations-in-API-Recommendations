package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Choose a fruit");

        XSSFRow row2 = sheet.createRow(1);
        XSSFCell cell2 = row2.createCell(0);

        XSSFDataValidationHelper validationHelper = new XSSFDataValidationHelper(sheet);
        CellRangeAddressList addressList = new CellRangeAddressList(1, 1, 0, 0);
        XSSFDataValidation dataValidation = new XSSFDataValidation(addressList, CellRangeAddressList.parseAddressAsArray("$A$2:$A$5", null, null, null, null, null));
        dataValidation.setShowDropList(true);

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        dataValidation.setExplicitList(list);
        sheet.addValidationData(dataValidation);

        FileOutputStream fileOut = new FileOutputStream("fruit.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}