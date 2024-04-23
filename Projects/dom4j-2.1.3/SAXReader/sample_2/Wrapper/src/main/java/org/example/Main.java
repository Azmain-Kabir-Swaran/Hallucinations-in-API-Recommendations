package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of SAXReader
        SAXReader reader = new SAXReader();

        try {
            // Read XML File
            Document document = reader.read(Main.class.getClassLoader().getResourceAsStream("yourfile.xml"));

            // Create a new "root" object
            Element root = document.getRootElement();

            // Get all the child elements
            for (Iterator it = root.elementIterator(); it.hasNext(); ) {
                Element element = (Element) it.next();
                System.out.println("Element: " + element.getName());
                System.out.println("Value: " + element.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}