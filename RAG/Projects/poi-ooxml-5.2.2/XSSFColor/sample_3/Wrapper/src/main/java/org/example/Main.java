package org.example;


import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;

public class Main {

    public static void main(String[] args) {
        // Create an XSSFColor object with RGB values
        XSSFColor color = new XSSFColor(new byte[]{(byte) 255, (byte) 0, (byte) 0}, null);

        // Create an XSSFFont object and set the color
        XSSFFont font = new XSSFFont();
        font.setColor(color);

        // Use the font in your code...
    }
}