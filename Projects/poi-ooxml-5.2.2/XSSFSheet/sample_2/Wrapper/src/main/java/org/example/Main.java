package org.example;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "path_to_your_excel_file";

        // Create InputStream object of filePath
        FileInputStream fis = new FileInputStream(filePath);

        // Create XSSFWorkbook object of fis
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        // Get the XSSFSheet object by sheet name
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // Close the stream
        fis.close();

        // Now you can work with sheet object like any other sheet object you know
    }
}