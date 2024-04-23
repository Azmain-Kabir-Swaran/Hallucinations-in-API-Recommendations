package org.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;

public class MyActivator implements BundleActivator {

    public void start(BundleContext context) throws BundleException {
        System.out.println("Hello world");
    }

    public void stop(BundleContext context) throws BundleException {
    }
}