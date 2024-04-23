package org.example;


import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

public class Main implements BundleListener {

    public static void main(String[] args) {
        // This is a placeholder main method, actual functionality
        // will be implemented in BundleListener interface.
    }

    @Override
    public void bundleChanged(BundleEvent event) {
        if (event.getType() == BundleEvent.STARTED) {
            Bundle bundle = event.getBundle();
            System.out.println(bundle.getSymbolicName() + " has started");
        } else if (event.getType() == BundleEvent.STOPPED) {
            Bundle bundle = event.getBundle();
            System.out.println(bundle.getSymbolicName() + " has stopped");
        }
    }
}