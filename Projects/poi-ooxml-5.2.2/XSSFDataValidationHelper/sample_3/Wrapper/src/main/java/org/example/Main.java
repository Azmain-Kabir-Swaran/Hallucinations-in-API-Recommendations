package org.example;


import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet");
        CellRangeAddressList addresses = new CellRangeAddressList(0, 5, 0, 0);
        XSSFDataValidation validation = new XSSFDataValidation(addresses, 1);
        validation.setShowDropList(true);
        validation.setErrorStyle(XSSFDataValidation.WarningStyle.STOP);

        sheet.addValidationData(validation);

        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        workbook.write(fileOut);
        fileOut.close();
    }
}