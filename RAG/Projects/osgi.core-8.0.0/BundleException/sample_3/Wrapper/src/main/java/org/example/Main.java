package org.example;


import org.osgi.framework.BundleException;

public class Main {
    public static void main(String[] args) {
        try {
            throwBundleException();
        } catch (BundleException e) {
            e.printStackTrace();
        }
    }

    private static void throwBundleException() throws BundleException {
        throw new BundleException(500, "This is a custom bundle exception");
    }
}