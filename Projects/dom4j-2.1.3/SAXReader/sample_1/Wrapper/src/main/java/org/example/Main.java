package org.example;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create an instance of SAXReader
        SAXReader reader = new SAXReader();

        // Parsing the document using SAX Reader
        Document document = reader.read(new File("path_to_your_file.xml"));

        // Getting the root element
        Element rootElement = document.getRootElement();

        // Getting list of nodes under the root element
        List<Element> list = rootElement.elements();

        for(Element node : list) {
            System.out.println(node.getName() + ":" + node.getText());
        }
    }
}