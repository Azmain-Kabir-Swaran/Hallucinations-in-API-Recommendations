package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Create DocumentFactory
        DocumentFactory factory = DocumentFactory.getInstance();

        // Create an empty XML Document using DocumentFactory
        Document document = factory.createDocument();
        
        // Add a root element "root" to document
        Element root = document.addElement("root");
        
        // Add a child element "element1" to root
        root.addElement("element1");

        // Print the XML representation of the document
        System.out.println(document.asXML());
        
        // SAXReader to parse XML from a String
        SAXReader reader = new SAXReader();
        String xmlString = "<root><element1>Hello</element1></root>";
        
        try {
            Document doc = reader.read(new StringReader(xmlString));
            Element rootElement = doc.getRootElement();
            
            System.out.println("Root Element : " + rootElement.getName());
            
            System.out.println("Element 1 Value : " + rootElement.elementText("element1"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}