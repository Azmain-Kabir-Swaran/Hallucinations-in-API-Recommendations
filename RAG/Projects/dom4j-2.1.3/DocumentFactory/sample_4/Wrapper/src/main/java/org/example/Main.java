package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        Document document = factory.createDocument();
        Element root = document.addElement("root");
        
        Element element1 = root.addElement("element1");
        element1.addText("text");
        
        System.out.println(document.asXML());
    }
}