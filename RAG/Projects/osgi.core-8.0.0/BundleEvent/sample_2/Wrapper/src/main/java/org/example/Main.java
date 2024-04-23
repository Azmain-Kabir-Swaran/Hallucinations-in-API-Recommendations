package org.example;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;

public class Main {
    BundleContext bundleContext;
    BundleTracker bundleTracker;

    public void start(BundleContext bundleContext) {
        this.bundleContext = bundleContext;

        bundleTracker = new BundleTracker(bundleContext, Bundle.STARTING, new BundleTrackerCustomizer() {
            public Object addingBundle(Bundle bundle, Object o) {
                System.out.println("Adding bundle: " + bundle.getSymbolicName());
                return null;
            }

            public void modifiedBundle(Bundle bundle, BundleEvent event, Object o) {
                System.outystem.out.println("Bundle changed: " + bundle.getSymbolicName());
            }

            public void removedBundle(Bundle bundle, BundleEvent event, Object o) {
                System.out.println("Removing bundle: " + bundle.getSymbolicName());
            }
        });

        bundleTracker.open();
    }

    public void stop(BundleContext bundleContext) {
        bundleTracker.close();
        this.bundleContext = null;
    }
}