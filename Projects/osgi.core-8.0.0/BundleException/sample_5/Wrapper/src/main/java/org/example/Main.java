package org.example;


import org.osgi.framework.BundleException;
import org.osgi.framework.Bundle;

public class Main {
    public static void main(String[] args) {
        // assuming some bundle instance is created
        Bundle bundle = null;
        
        try {
            // simulate a potential bundle exception
            bundle.start();
        } catch (BundleException e) {
            // handle the exception
            System.err.println("Bundle could not be started due to an exception: " + e.getMessage());
        }
    }
}