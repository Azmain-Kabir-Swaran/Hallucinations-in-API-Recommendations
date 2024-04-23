package org.example;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleListener;

public class MyBundleListener implements BundleListener {
    private BundleContext context;

    public MyBundleListener(BundleContext context) {
        this.context = context;
        context.addBundleListener(this);
    }

    public void bundleChanged(BundleEvent event) {
        int type = event.getType();
        System.out.println("Bundle " + event.getBundle().getSymbolicName() + " changed. Event type: " + type);
    }
}