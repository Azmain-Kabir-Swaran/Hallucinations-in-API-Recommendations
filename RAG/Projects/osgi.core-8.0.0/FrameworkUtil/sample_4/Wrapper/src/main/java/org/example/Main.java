package org.example;


import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.framework.ServiceReference;

public class Main {

    // Assume that you have a bundle context
    private static BundleContext bundleContext;

    public static void main(String[] args) {
        // Assume there is a bundle context here somewhere
        BundleContext bundleContext = ...;

        // Create a service tracker with a specific interface
        ServiceTracker tracker = new ServiceTracker(bundleContext, "required.service.interface.name", null);

        // Start the tracker
        tracker.open();

        // Get the service
        Object service = tracker.getService();

        // Now you can use the service in your code
        // But please note that you should clean up the service reference when you're done
        ServiceReference reference = tracker.getServiceReference();
        try {
            bundleContext.ungetService(reference);
        } finally {
            if (reference != null) {
                bundleContext.ungetService(reference);
            }
        }
    }
}