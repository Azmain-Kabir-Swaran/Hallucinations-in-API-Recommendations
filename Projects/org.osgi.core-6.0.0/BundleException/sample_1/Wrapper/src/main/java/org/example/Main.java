package org.example;


import org.osgi.framework.BundleException;

public class Main {

    public static void main(String[] args) {
        try {
            // Replace with your code using BundleException API
            throw new BundleException("Sample error message");
        } catch (BundleException e) {
            System.out.println("Caught BundleException: " + e.getMessage());
        }
    }
}