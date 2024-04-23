package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // XML string to parse
        String xmlString = "<root><child1 attribute=\"value1\">Content1</child1><child2>Content2</child2></root>";

        // Create a Document object from the XML string
        Document document = DocumentHelper.parseText(xmlString);

        // Get the root element of the document
        Element rootElement = document.getRootElement();

        System.out.println("Root Element: " + rootElement.getName());

        // Get all children of the root element and print their names and contents
        for (Object obj : rootElement.elements()) {
            Element child = (Element) obj;
            System.out.println("Child: " + child.getName() + " Content: " + child.getText() +
                    " Attribute: " + child.attributeValue("attribute"));
        }
    }
}