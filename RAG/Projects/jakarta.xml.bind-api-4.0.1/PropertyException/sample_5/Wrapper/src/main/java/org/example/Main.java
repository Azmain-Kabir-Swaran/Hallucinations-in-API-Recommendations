package org.example;


import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

public class Main {
    public static void main(String[] args) {
        try {
            throwPropertyException();
        } catch (PropertyException e) {
            e.printStackTrace();
        }
    }

    static void throwPropertyException() throws PropertyException {
        // your code here
        throw new PropertyException("PropertyException occurred.");
    }
}