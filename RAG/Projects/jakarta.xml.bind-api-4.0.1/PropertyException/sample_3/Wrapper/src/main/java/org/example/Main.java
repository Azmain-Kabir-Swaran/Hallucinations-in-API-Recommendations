package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.PropertyException;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        // This should be your xml file
        File xml = new File("yourfile.xml");

        // Get the JAXBContext - the JAXBContext is the factory for unmarshalling an XML
        JAXBContext jaxbContext = JAXBContext.newInstance(YourClassName.class);

        // Create Unmarshaller
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        // What is being unmarshalled
        YourClassName yourObject = (YourClassName) jaxbUnmarshaller.unmarshal(xml);

        System.out.println(yourObject.toString());
    }
}