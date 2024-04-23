package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentFactory;

public class Main {
    public static void main(String[] args) {
        // create an instance of DocumentFactory
        DocumentFactory factory = DocumentFactory.getInstance();

        // create a new document with the root element "root"
        Document document = factory.createDocument();

        // get the root element
        org.dom4j.Element root = document.addElement("root");

        // print the document
        System.out.println(document.asXML());
    }
}