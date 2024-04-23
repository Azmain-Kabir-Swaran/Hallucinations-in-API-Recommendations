package org.example;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.framework.BundleActivator;

public class Main implements BundleListener {

    ServiceReference ref;

    //...
    //...
    //...

    @Override
    public void bundleChanged(BundleEvent event) {
        Bundle bundle = event.getBundle();
        BundleEvent.PACKAGES_REFRESHED_EVENT:
            System.out.println("Packages refreshed in " + bundle.getSymbolicName());
            break;

        BundleEvent.STARTING_EVENT:
            System.out.println("Starting bundle: " + bundle.getSymbolicName());
            break;

        BundleEvent.STARTED_EVENT:
            System.out.println("Started bundle: " + bundle.getSymbolicName());
            break;

        BundleEvent.STOPPING_EVENT:
            System.out.println("Stopping bundle: " + bundle.getSymbolicName());
            break;

        BundleEvent.STOPPED_EVENT:
            System.out.println("Stopped bundle: " + bundle.getSymbolicName());
            break;

        BundleEvent.UPDATED_EVENT:
            System.out.println("Updated bundle: " + bundle.getSymbolicName());
            break;
    }

    //...
    //...
    //...
}