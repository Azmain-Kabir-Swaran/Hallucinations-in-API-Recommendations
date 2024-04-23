package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;

public class Main {
    public static void main(String[] args) {
        // create a DocumentFactory
        DocumentFactory factory = new DocumentFactory();

        // create a Document
        Document doc = factory.createDocument();
        
        // create a root Element and add it to the Document
        Element root = factory.createElement("root");
        doc.setDocumentElement(root);
        
        // create a child Element and add it to the root Element
        Element child = factory.createElement("child");
        root.add(child);

        // print the XML representation of the Document
        System.out.println(doc.asXML());
    }
}