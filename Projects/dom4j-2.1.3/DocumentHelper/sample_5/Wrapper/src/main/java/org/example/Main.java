package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Creating XML Document
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("root");

        // Adding child nodes
        Element node1 = root.addElement("node1");
        node1.setText("Node 1 Content");
        Element node2 = root.addElement("node2");
        node2.setText("Node 2 Content");

        // Writing to XML file
        try {
            FileWriter writer = new FileWriter("sample.xml");
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter xmlWriter = new XMLWriter(writer, format);
            xmlWriter.write(document);
            xmlWriter.close();
            System.out.println("XML File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}