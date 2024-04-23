package org.example;


import org.apache.poi.xssf.usermodel.XSSFColor;

public class Main {
    public static void main(String[] args) {
        try {
            XSSFColor color = new XSSFColor(new byte[] { (byte) 0x80, (byte) 0x80, (byte) 0x80 });
            System.out.println("R: " + color.getRGB()[0] + ", G: " + color.getRGB()[1] + ", B: " + color.getRGB()[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}