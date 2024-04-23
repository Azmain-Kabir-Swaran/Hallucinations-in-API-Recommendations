package org.example;


import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFPatriarch;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new workbook
        XSSFWorkbook wb = new XSSFWorkbook();

        // Add a new sheet and create a cell and write some content
        XSSFSheet sheet = wb.createSheet("First Sheet");
        XSSFPatriarch patriarch = sheet.createRow(0).createCell(0);
        patriarch.getCTRow().addNewCt().addNewT().setVal("This is a comment");
        patriarch.getCTCell().addNewP().addNewT().setVal("This is a comment again");

        // Create a comment object
        XSSFComment comment = wb.getComments().createComment(patriarch);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("NewWorkbook.xlsx");
        wb.write(fileOut);
        fileOut.close();
    }
}