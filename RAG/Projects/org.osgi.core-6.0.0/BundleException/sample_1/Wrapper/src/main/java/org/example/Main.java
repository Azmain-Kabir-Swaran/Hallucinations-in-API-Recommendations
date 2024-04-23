package org.example;


import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

public class Main {
    public static void main(String[] args) {
        BundleContext context;
        //Assuming context has been initialized correctly
        try {
            context.getBundle(0).start(Bundle.START_TRANSIENT);
        } catch (BundleException e) {
            e.printStackTrace();
        }
    }
}