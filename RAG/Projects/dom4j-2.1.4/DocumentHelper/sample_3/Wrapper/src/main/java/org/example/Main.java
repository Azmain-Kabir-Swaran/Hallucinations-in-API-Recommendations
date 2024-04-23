package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Attribute;

public class Main {
    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();
        Element rootElement = document.addElement("root");
        Element childElement = rootElement.addElement("child");
        Attribute childAttribute = childElement.addAttribute("attribute", "value");
        System.out.println(document.asXML());
    }
}