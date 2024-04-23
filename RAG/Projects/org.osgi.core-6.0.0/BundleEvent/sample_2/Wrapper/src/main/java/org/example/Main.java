package org.example;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleContext;

public class Main {

    BundleContext context;

    public Main(BundleContext context) {
        this.context = context;
    }

    void addBundleListener() {
        this.context.addBundleListener(new BundleListener() {
            @Override
            public void bundleChanged(BundleEvent event) {
                Bundle bundle = event.getBundle();
                int type = event.getType();

                switch (type) {
                    case BundleEvent.STARTED:
                        System.out.println("Bundle " + bundle.getSymbolicName() + " started.");
                        break;
                    case BundleEvent.STOPPED:
                        System.out.println("Bundle " + bundle.getSymbolicName() + " stopped.");
                        break;
                    case BundleEvent.UNINSTALLED:
                        System.out.println("Bundle " + bundle.getSymbolicName() + " uninstalled.");
                        break;
                    // Handle other types as needed...
                }
            }
        });
    }
}