package org.example;


import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public class Main {

    public static void main(String[] args) {
        BundleContext bundleContext = FrameworkUtil.getBundle(Main.class).getBundleContext();
        // more code can be here for using other APIs, which do not need importing new dependencies
    }
}