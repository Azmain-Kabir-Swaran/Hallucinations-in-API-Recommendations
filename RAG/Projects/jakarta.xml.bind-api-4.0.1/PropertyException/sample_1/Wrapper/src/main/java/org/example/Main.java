package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.PropertyException;
import java.beans.*;
import java.lang.reflect.InvocationHandler;

public class Main {
    public static void main(String[] args) throws PropertyException {
        // use jakarta.xml.bind.JAXBContext 
        JAXBContext context = JAXBContext.newInstance("com.example.myschema");
    }
}