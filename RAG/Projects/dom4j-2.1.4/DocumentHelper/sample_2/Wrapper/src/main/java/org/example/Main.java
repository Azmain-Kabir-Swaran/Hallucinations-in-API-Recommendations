package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Main {
    public static void main(String[] args) throws DocumentException {
        // Creating a Document
        Document document = DocumentHelper.parseText(
                "<person><name>John</name><surname>Doe</surname></person>");
        
        // Getting the root element
        Element root = document.getRootElement();

        // Getting child nodes of the root
        for (Object node : root.content()) {
            Element e = (Element) node;
            System.out.println(e.getName() + ": " + e.getText());
        }
    }
}