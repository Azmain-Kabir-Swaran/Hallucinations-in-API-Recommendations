package org.example;


import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFColor;

public class Main {

    public static void main(String[] args) {
        
        XSSFCellStyle cellStyle = new XSSFCellStyle();
        Font font = new Font();
        byte[] rgb = new byte[]{(byte) 0x1E, (byte) 0x90, (byte) 0xFF};

        XSSFColor mycolor = new XSSFColor(rgb);
        font.setColor(mycolor);

        cellStyle.setFont(font);
    }
}