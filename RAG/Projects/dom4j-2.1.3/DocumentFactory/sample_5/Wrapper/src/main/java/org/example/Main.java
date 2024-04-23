package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Main {

    public static void main(String[] args) {
        
        // Create a new XML document
        Document document = DocumentHelper.createDocument();
        
        // Create a new root element for the document
        Element root = document.addElement("root");

        // Add child elements to the root
        for (int i = 0; i < 10; i++) {
            root.addElement("child" + i);
        }

        // Print the XML representation of the document
        System.out.println(document.asXML());
    }
}