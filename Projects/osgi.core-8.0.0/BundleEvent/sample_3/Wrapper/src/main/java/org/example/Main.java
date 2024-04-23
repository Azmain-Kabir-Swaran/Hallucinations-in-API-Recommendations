package org.example;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.BundleTracker;
import org.osgi.util.tracker.BundleTrackerCustomizer;

public class Main {
    
    private BundleContext context;
    private BundleTracker tracker;

    public void start(BundleContext context) throws Exception {
        this.context = context;

        tracker = new BundleTracker(context, Bundle.STARTING | Bundle.STOPPING | Bundle.STARTED | Bundle.STOPPED, null);
        tracker.open();
    }

    public void stop(BundleContext context) throws Exception {
        if (tracker != null) {
            tracker.close();
        }
    }

    public void bundleChanged(BundleEvent event) {
        System.out.println("Bundle Event: " + event.getType());
    }
}