package org.example;


import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.BundleContext;

public class Main {
    public static void main(String[] args) {
        BundleContext ctx = // Obtain your BundleContext somehow...
        Bundle bundle = // Obtain your Bundle somehow...
        
        try {
            bundle.start();
        } catch (BundleException e) {
            System.out.println("Failed to start the bundle.");
        }
    }
}