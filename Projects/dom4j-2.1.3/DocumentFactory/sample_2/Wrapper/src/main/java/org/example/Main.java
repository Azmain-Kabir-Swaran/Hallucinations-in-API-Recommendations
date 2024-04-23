package org.example;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            // Create a DocumentFactory using SAXBuilder
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(new File("file.xml"));

            Element root = document.getRootElement();

            // add elements under root
            for (int i = 0; i < 10; i++) {
                Element node = DocumentHelper.createElement("node" + i);
                node.setText("This is node No." + i);
                root.add(node);
            }

            // write document to file
            File outFile = new File("output.xml");
            XMLWriter writer = new XMLWriter(new FileWriter(outFile), OutputFormat.createPrettyPrint());
            writer.write(document);
            writer.close();

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}