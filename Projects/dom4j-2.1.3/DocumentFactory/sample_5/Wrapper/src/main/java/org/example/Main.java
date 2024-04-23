package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Main {
    public static void main(String[] args) {
        // Create a Document object
        Document document = DocumentHelper.createDocument();

        // Create a root element
        Element rootElement = document.addElement("rootElement");

        // Create a child element
        Element textElement = rootElement.addElement("textElement");
        textElement.addText("This is sample text");

        // Print the XML representation
        System.out.println(document.asXML());
    }
}