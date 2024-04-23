package org.example;


import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        try (InputStream inp = new FileInputStream("workbook.xlsx")) {
            Workbook workbook = WorkbookFactory.create(inp);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.createCell(0);

            XSSFComment comment = (XSSFComment) sheet.getWorkbook().createRichTextString("This is a comment!");
            comment.setAuthor("Author Name");
            cell.setCellComment(comment);
        }
    }
}