package org.example;


import org.osgi.core.Bundle;
import org.osgi.core.BundleContext;
import org.osgi.core.BundleEvent;
import org.osgi.core.FrameworkEvent;
import org.osgi.framework.BundleException;

public class Main {
    public static void main(String[] args) {
        BundleContext context = // initialize the BundleContext somehow
        context.addBundleListener(new BundleListener() {
            public void bundleChanged(BundleEvent event) {
                Bundle bundle = event.getBundle();
                int type = event.getType();
                String symbolicName = bundle.getSymbolicName();
                String version = bundle.getVersion().toString();
                String state = bundle.getState();
                
                if (type == FrameworkEvent.STARTED) {
                    System.out.println("Started: " + bundle.getSymbolicName());
                } else if (type == FrameworkEvent.STOPPED) {
                    System.out.println("Stopped: " + bundle.getSymbolicName());
                }
            }
        });
    }
}