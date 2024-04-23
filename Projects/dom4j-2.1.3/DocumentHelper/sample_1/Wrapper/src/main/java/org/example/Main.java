package org.example;


import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.InputSource;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Document doc = DocumentHelper.parseText("<employee></employee>");
            Element root = doc.getRootElement();

            Element name = root.addElement("name");
            name.addAttribute("id", "1");
            name.addText("John Doe");

            Element age = root.addElement("age");
            age.addText("30");

            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setEncoding("UTF-8");

            XMLWriter writer = new XMLWriter(new FileWriter("employee.xml"), format);
            writer.write(doc);
            writer.close();

            System.out.println("XML file created successfully!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}