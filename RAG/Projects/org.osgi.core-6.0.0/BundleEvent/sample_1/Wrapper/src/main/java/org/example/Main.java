package org.example;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleListener;

public class Main implements BundleListener {

    private BundleContext context;

    public void start(BundleContext context) {
        this.context = context;
        context.addBundleListener(this);
    }

    public void stop(BundleContext context) {
        context.removeBundleListener(this);
        this.context = null;
    }

    @Override
    public void bundleChanged(BundleEvent event) {
        Bundle bundle = event.getBundle();

        int type = event.getType();
        String message = null;

        switch (type) {
            case BundleEvent.STARTED:
                message = "Bundle started";
                break;
            case BundleEvent.STOPPED:
                message = "Bundle stopped";
                break;
            case BundleEvent.UPDATED:
                message = "Bundle updated";
                break;
        }

        System.out.println(message + ": " + bundle.getSymbolicName());
    }
}