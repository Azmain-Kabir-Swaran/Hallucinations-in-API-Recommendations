package org.example;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class Main {

    public static void main(String[] args) {
        XStream xStream = new XStream(new XmlFriendlyNameCoder());
        // use xStream as per your requirements
    }
}