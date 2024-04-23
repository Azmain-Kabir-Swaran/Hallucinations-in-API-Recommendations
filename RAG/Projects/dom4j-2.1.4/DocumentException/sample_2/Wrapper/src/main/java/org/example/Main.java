package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Main {

    public static void main(String[] args) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read("/path/to/xml/file.xml");
            System.out.println("Document successfully read");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}