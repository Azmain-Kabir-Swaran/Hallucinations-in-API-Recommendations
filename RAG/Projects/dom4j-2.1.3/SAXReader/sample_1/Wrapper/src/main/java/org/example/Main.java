package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Main {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();

        // Load xml file.
        Document document;
        try {
            document = saxReader.read("yourXmlFile.xml");

            // Get root element.
            Element rootElement = document.getRootElement();

            // Get nodes.
            @SuppressWarnings("unchecked")
            Iterator<Element> it = rootElement.elementIterator();

            // Iterate nodes.
            while (it.hasNext()) {
                Element node = it.next();
                System.out.println("Node name: " + node.getName());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}