package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class Main {
    public static void main(String[] args) {
        String xml = "<root><element>Hello, World!</element></root>";
        try {
            Document document = DocumentHelper.parseText(xml);
            System.out.println(document.asXML());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}