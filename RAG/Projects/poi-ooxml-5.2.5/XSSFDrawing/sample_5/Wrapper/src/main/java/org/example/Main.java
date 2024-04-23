package org.example;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.util.IOUtils;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Drawing test");

        int drawingIdx = wb.addDrawing().addDrawing().getDrawingPatriarch().createClientAnchor().addNonVisualChildElement(new XDCPictureData("rId1"));
        XSSFClientDrawing drawing = new XSSFClientDrawing(wb, sheet.getDrawingPatriarch().createDrawingPatriarch(), drawingIdx);

        XSSFClientAnchor anchor = drawing.createAnchor();

        anchor.setAnchorType(AnchorType.DRAWING_ABSOLUTE);

        anchor.setFrom(new XSSFPicture(new FileInputStream("image.jpeg"), ImageType.JPEG);
        anchor.getFrom().resize(150, 200);

        drawing.createPicture(anchor, sheet.createDrawingPatriarch().addPicture(anchor.getPicture(), sheet.addImage(anchor.getPicture().getImage())));

        FileOutputStream fileOut = new FileOutputStream("myfile.xlsx");
        wb.write(fileOut);
        fileOut.close();
    }
}