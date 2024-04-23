package org.example;


import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Bundle;

public class Main {
    public static void main(String[] args) {
        BundleEvent event = createBundleEvent();
        System.out.println("Bundle Event: " + event.toString());
    }

    public static BundleEvent createBundleEvent() {
        return new BundleEvent(Bundle.STARTING, new Bundle());
    }
}