package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Create a sample XML String
        String xmlString = "<root><person><name>John Doe</name><age>30</age></person></root>";

        // Convert the XML string into input stream
        InputStream is = new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8));

        // Create a Document object using DocumentHelper and SAXReader
        try {
            Document document = DocumentHelper.parseText(xmlString);
            SAXReader saxReader = new SAXReader();
            Document doc = saxReader.read(is);

            // Read element values from the document
            Element root = doc.getRootElement();
            System.out.println("Person Name : " + root.element("person").elementText("name"));
            System.out.println("Person Age : " + root.element("person").elementText("age"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}