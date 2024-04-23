package org.example;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFComment;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        // Create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a sheet
        XSSFSheet sheet = workbook.createSheet();

        // Create a row
        XSSFRow row = sheet.createRow(0);

        // Create a cell
        XSSFCell cell = row.createCell(0);

        // Create a comment with "Test Comment" text
        XSSFComment comment = sheet.createComment(new org.apache.poi.ss.usermodel.ClientAnchor(0,0,0,0, Collections.<Integer>emptyList()));
        comment.setString(new XSSFRichTextString("Test Comment"));

        // Add the comment to the cell
        cell.setCellComment(comment);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    }

}