package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a SAXReader
            SAXReader reader = new SAXReader();

            // Read an XML file by path
            Document document = reader.read(new File("/path/to/your/file.xml"));

            // Your logic here
            // Let's just print the root element name
            System.out.println("Root element: " + document.getRootElement().getName());
        } catch (DocumentException e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
}