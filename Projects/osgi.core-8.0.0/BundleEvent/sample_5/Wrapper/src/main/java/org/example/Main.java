package org.example;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Main {
    private BundleContext context;

    public Main(BundleContext context) {
        this.context = context;
    }

    public void handleBundleEvent(BundleEvent event) {
        // Handle the bundle event
    }

    public void handleServiceEvent(ServiceReference reference) {
        // Handle service reference
    }
}