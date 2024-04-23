package org.example;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddressList;

public class Main {
    public static void main(String[] args) {
        XSSFCell cell = new XSSFCell();

        CellRangeAddressList addressList = new CellRangeAddressList();
        addressList.add(new CellRangeAddress(0, 10, 0, 2));

        XSSFDataValidationConstraint dvConstraint = new XSSFDataValidationConstraint(
                XSSFDataValidationConstraint.ValidationType.LIST,
                addressList);

        cell.getCellStyle().setDataValidation(dvConstraint);
    }
}