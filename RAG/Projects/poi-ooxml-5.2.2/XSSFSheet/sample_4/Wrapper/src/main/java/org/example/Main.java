package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        XSSFWorkbook workbook;
        try {
            FileInputStream file = new FileInputStream("Path_to_your_Excel_file.xlsx");

            //Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(file);

            //Get the sheet at index 0
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Traversing over each row
            for (int i = 0; i <= sheet.getLastRowNum(); i++) {

                //Creating a Row object to retrieve the row
                XSSFRow row = sheet.getRow(i);

                //Traversing over each cell
                for (int j = 0; j < row.getLastCellNum(); j++) {

                    //Get the cell at index j
                    XSSFCell cell = row.getCell(j);

                    //Printing the cell value
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}