package org.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;

public class Main implements BundleActivator, ServiceListener {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting bundle");
        context.addServiceListener(this, "(objectclass=*)");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping bundle");
        context.removeServiceListener(this);
    }

    @Override
    public void serviceChanged(ServiceEvent event) {
        switch (event.getType()) {
            case ServiceEvent.REGISTERED:
                System.out.println("Service " + event.getServiceReference() + " registered");
                break;
            case ServiceEvent.UNREGISTERING:
                System.out.println("Service " + event.getServiceReference() + " unregistered");
                break;
        }
    }
}