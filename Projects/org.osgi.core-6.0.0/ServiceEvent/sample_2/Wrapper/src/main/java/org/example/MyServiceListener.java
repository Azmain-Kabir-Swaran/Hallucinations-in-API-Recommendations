package org.example;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceReference;

public class MyServiceListener {
    private BundleContext context;

    public void handleEvent(ServiceEvent event) {
        // Process the event here...
    }

    public void addServiceListener() {
        // Add your service listener to the bundle context
        context.addServiceListener(this);
    }

    public void stop() {
        context.removeServiceListener(this);
    }
}