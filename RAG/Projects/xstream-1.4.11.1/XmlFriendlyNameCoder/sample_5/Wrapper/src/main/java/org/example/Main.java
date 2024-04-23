package org.example;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class Main {
    public static void main(String[] args) {
        XStream xStream = new XStream(new XmlFriendlyNameCoder());

        Person person = new Person("John Doe", 30);
        String xml = xStream.toXML(person);

        System.out.println(xml);
    }
}