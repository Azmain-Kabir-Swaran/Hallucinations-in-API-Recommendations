package org.example;


import org.apache.poi.xssf.usermodel.XSSFColor;

public class Main {
    public static void main(String[] args) {
        byte rgb[] = new byte[] { (byte) 0xFF, (byte) 0xC0, (byte) 0x00 };
        XSSFColor color = new XSSFColor(rgb, null, new byte[] { 0x00, 0x00 });

        System.out.println(color.getRGB());
    }
}