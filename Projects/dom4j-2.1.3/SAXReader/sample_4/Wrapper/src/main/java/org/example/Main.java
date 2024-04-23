package org.example;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Main {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        
        try {
            // parse a xml file into a Document
            Document doc = saxReader.read(Main.class.getResourceAsStream("/example.xml"));

            // get the root element from the document
            Element root = doc.getRootElement();

            // get a list of elements
            @SuppressWarnings("unchecked")
            List<Element> elements = root.elements();

            for (Element element : elements) {
                System.out.println(element.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}