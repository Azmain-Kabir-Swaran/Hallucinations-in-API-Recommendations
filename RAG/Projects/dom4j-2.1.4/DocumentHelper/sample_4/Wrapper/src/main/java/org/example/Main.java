package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String xmlFile = "yourXMLFilePath.xml";
        InputStream is = null;
        
        try {
            is = new FileInputStream(new File(xmlFile));
            
            Document document = DocumentHelper.parseText(is);
            Element root = document.getRootElement();
            
            // Extract the data from XML file here
            String extractedData = root.element("yourElement").getText(); 
            System.out.println("Extracted data: " + extractedData);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}