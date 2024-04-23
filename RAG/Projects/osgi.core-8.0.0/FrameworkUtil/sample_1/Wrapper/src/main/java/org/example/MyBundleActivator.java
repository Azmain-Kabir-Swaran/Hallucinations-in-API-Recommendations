package org.example;

import aQute.bnd.annotation.ProviderType;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import aQute.bnd.annotation.ProviderType;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import aQute.bnd.annotation.ProviderType;

public class MyBundleActivator implements BundleActivator {

    private BundleContext bundleContext;

    public void start(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
        MyServiceTracker myServiceTracker = new MyServiceTracker(bundleContext);
        myServiceTracker.open();
    }

    public void stop(BundleContext bundleContext) {
        bundleContext = null;
    }

    private static class MyServiceTracker extends ServiceTracker {

        public MyServiceTracker(BundleContext context) {
            super(context, "my.service", null);
        }

        // Handle myService instance when it is added to the service registry.
        public Object addingService(ServiceReference reference) {
            Object service = super.addingService(reference);
            System.out.println("MyService instance added to the registry.");
            return service;
        }
    }
}