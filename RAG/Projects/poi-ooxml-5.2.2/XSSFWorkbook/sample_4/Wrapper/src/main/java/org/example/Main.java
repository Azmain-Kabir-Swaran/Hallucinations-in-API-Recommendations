package org.example;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        // create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        
        // ...add your code here...
        
        // close the workbook
        try {
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}