package org.example;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

public class Main implements BundleListener {
    private BundleContext context;

    // You'll typically get the BundleContext from your main() method somehow.
    public void setContext(BundleContext context) {
        this.context = context;
    }

    @Override
    public void bundleChanged(BundleEvent event) {
        // Here you can handle any bundle changes that occur
        switch (event.getType()) {
            case BundleEvent.STARTED:
                System.out.println("Bundle " + event.getBundle().getSymbolicName()
                        + " started");
                break;
            case BundleEvent.STARTING:
                System.out.println("Bundle " + event.getBundle().getSymbolicName()
                        + " starting");
                break;
            case BundleEvent.STOPPING:
                System.out.println("Bundle " + event.getBundle().getSymbolicName()
                        + " stopping");
                break;
            case BundleEvent.STOPPED:
                System.out.println("Bundle " + event.getBundle().getSymbolicName()
                        + " stopped");
                break;
            case BundleEvent.UNINSTALLED:
                System.out.println("Bundle " + event.getBundle().getSymbolicName()
                        + " uninstalled");
                break;
            case BundleEvent.UPDATED:
                System.out.println("Bundle " + event.getBundle().getSymbolicName()
                        + " updated");
                break;
            default:
                System.out.println("Unknown event type");
                break;
        }
    }
}