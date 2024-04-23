package org.example;


import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;

public class Main {

    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();
        try {
            // do something with the factory
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}