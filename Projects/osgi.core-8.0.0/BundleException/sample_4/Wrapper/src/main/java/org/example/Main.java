package org.example;


import org.osgi.framework.BundleException;

public class Main {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (BundleException e) {
            e.printStackTrace();
        }
    }

    public static void throwException() throws BundleException {
        throw new BundleException("Something went wrong!");
    }
}