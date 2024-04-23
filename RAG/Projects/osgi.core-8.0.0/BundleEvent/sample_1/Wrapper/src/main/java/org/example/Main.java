package org.example;


import org.osgi.framework.BundleEvent;

public class Main {
    public static void main(String[] args) {
        // BundleEvent object creation
        BundleEvent bundleEvent = new BundleEvent(1);

        // Using BundleEvent methods
        int type = bundleEvent.getType();
        System.out.println("Type of bundle event: " + type);
    }
}