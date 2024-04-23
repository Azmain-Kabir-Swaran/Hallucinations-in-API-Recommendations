package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.io.XMLReader;
import org.xml.sax.InputSource;
import java.io.StringReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws DocumentException {
        // Create an empty Document using DocumentFactory.
        DocumentFactory factory = DocumentFactory.getInstance();
        Document document = factory.createDocument();

        // Add a root element to the document.
        org.dom4j.Element root = document.addElement("root");

        // Create child elements and add them to the root.
        for (int i = 0; i < 3; i++) {
            org.dom4j.Element e = root.addElement("child");
            e.addAttribute("name", "Attribute" + i);
            e.addText("Text " + i);
        }

        // Print the XML representation of the document.
        System.out.println(document.asXML());
    }
}