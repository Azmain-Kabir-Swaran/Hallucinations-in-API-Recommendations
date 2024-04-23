package org.example;


import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.*;

public class Main {

    @Reference
    BundleContext context;

    @Reference
    ServiceReference serviceReference;

    @Activate
    void activate(BundleContext context) throws Exception {
        context.addBundleListener(this::bundleChanged);
    }

    void bundleChanged(BundleEvent event) {
        switch (event.getType()) {
            case BundleEvent.STARTED:
                System.out.println("Bundle started");
                break;
            case BundleEvent.STOPPED:
                System.out.println("Bundle stopped");
                break;
            case BundleEvent.UPDATED:
                System.out.println("Bundle updated");
                break;
        }
    }

    void getService() {
        context.getService(serviceReference);
    }

    public static void main(String[] args) throws Exception {
        Main m = new Main();
        m.activate(null);
        Thread.sleep(5000);
    }
}