package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        Document document = factory.createDocument();
        Element root = document.addElement("root");
        root.addAttribute("test", "attribute");

        Element element = root.addElement("element");
        element.addAttribute("id", "1");
        element.addText("Hello, World!");

        System.out.println(document.asXML());
    }
}