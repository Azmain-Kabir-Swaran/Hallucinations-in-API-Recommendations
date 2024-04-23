package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Main {
    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        String fileName = "test.xml";  // replace this with the actual file name
        Document document = null;

        try {
            document = reader.read(fileName);
            System.out.println(document);  // output entire document
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}