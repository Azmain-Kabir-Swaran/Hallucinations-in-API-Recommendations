package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        
        // Creating document
        Document document = factory.createDocument();
        
        // Creating root element
        Element rootElement = document.addElement("root");
        
        // Creating child element and setting attribute
        Element childElement = rootElement.addElement("child");
        childElement.addAttribute("attr", "value");
        
        // Printing the document as string
        System.out.println(document.asXML());
    }
}