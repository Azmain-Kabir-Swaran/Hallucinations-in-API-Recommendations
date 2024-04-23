package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.QName;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creating a DocumentFactory
        DocumentFactory df = new DocumentFactory();

        // Creating a Document from DocumentFactory
        Document document = df.createDocument();

        // Creating a Map to contain QNames
        Map<QName, String> map = new HashMap<QName, String>();

        // Creating a QName for the map
        QName qname = df.createQName("Element", "");

        // Adding a value to the map
        map.put(qname, "My first dom4j document");

        // Creating a Node from the map
        df.createNode(map);

        // Printing the Document
        System.out.println(document);
    }
}