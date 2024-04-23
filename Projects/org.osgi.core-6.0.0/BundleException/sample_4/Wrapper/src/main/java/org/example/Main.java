package org.example;


import org.osgi.framework.BundleException;

public class Main {

    static class Bundle {
        void callMethodThatThrowsException() throws BundleException {
            throw new BundleException("Exception of Bundle");
        }
    }

    public static void main(String[] args) {
        Bundle bundle = new Bundle();
        try {
            bundle.callMethodThatThrowsException();
        } catch (BundleException e) {
            System.out.println("Caught BundleException: " + e.getMessage());
        }
    }
}