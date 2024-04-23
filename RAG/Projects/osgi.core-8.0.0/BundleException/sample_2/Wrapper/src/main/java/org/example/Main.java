package org.example;


import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtain the bundle context
            BundleContext bundleContext = ...;

            // Get a bundle from the bundle context
            Bundle bundle = bundleContext.getBundle();

            // Do some bundle-related operations
            bundle.start(Bundle.START_TRANSIENT);
            bundle.stop();

            // Throw a bundle exception (for demonstration purposes)
            throw new BundleException();
        } catch (BundleException e) {
            e.printStackTrace();
        }
    }
}