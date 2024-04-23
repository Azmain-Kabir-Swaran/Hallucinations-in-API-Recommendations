package org.example;


import org.osgi.framework.BundleEvent;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class Main {

    public static void main(String[] args) {
        BundleContext bundleContext = ...; // initialize with the appropriate context
        Bundle bundle = ...; // initialize with the bundle you want to track

        bundle.addEventListener(bundleContext);
        bundle.start(Bundle.START_TRANSIENT);

        // Wait for any of our events
        BundleEvent be = bundle.waitForStop(1000);

        if (be != null) {
            // Process the bundle event
            if (be.getType() == BundleEvent.STOPPED) {
                System.out.println("Bundle " + bundle.getSymbolicName() + " has stopped");
            }
        } else {
            System.out.println("Bundle did not stop in time");
        }
    }
}