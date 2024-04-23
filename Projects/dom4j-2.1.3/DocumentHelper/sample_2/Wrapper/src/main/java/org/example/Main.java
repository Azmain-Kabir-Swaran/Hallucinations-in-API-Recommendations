package org.example;


import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        
        SAXReader reader = new SAXReader();
        
        // Read the XML file
        Document doc = reader.read(new File("input.xml"));
        
        // Print the document
        System.out.println(doc.asXML());
    }
}