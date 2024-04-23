package org.example;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

public class Main {

    public static void main(String[] args) throws Exception {
        BundleContext context = null;  // Get the BundleContext
        EventAdmin admin = null;

        // Getting ServiceReference for EventAdmin using BundleContext
        ServiceReference<EventAdmin> reference = context.getServiceReference(EventAdmin.class);

        // Fetching EventAdmin service
        if (reference != null) {
            admin = context.getService(reference);
        }

        // Registering service listener
        admin.postEvent(new Event("testEvent", "testTopic"));

        // Unregister the listener
        context.ungetService(reference);
    }
}