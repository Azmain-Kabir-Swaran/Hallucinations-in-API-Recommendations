package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Main {
    public static void main(String[] args) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read("invalid.xml");
        } catch (DocumentException e) {
            System.out.println("DocumentException caught: " + e.getMessage());
        }
    }
}