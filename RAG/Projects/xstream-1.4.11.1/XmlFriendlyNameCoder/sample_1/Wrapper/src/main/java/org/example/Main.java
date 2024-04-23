package org.example;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class Main {

    public static void main(String[] args) {
        XStream xstream = new XStream(new XmlFriendlyNameCoder());
        // Here you can define how the XML serialization will be done according to your requirements
        // Example: xstream.alias("book", Book.class);
        String xml = xstream.toXML(/* your object */);
        System.out.println(xml);
    }
}