package org.example;


import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Main {

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Datatypes in Java");

        Object[] datatypes = { "Integer", "Float", "Double" };

        int rowNum = 0;
        for (Object obj : datatypes) {
            Row row = sheet.createRow(rowNum++);

            int cellNum = 0;
            for (Object field : fields) {
                Cell cell = row.createCell(cellNum++);
                cell.setCellValue(field.toString());
            }
        }
    }
}