package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Main {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read("your-file.xml");
            // Do something with the document...
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}