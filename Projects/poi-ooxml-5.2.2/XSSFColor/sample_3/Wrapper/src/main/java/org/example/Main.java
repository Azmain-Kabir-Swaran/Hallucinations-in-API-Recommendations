package org.example;


import org.apache.poi.xssf.usermodel.XSSFColor;

public class Main {

    public static void main(String[] args) {

        try {
            // Create an RGB color
            XSSFColor color = new XSSFColor(new byte[]{(byte)0, (byte)0, (byte)0}, null, null);

            // Display the RGB values of the color
            byte[] rgb = color.getRGB();
            System.out.println("RGB values: " + rgb[0] + ", " + rgb[1] + ", " + rgb[2]);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}