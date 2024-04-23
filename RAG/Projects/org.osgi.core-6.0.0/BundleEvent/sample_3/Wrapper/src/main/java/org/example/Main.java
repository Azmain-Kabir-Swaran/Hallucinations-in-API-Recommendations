package org.example;


import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

public class Main implements BundleListener {

    public static void main(String[] args) {
        BundleContext bundleContext; // assuming you've some method to get your BundleContext

        Main main = new Main();
        bundleContext.addBundleListener(main);
    }

    @Override
    public void bundleChanged(BundleEvent event) {
        switch(event.getType()) {
            case BundleEvent.STARTED:
                System.out.println("Bundle started: " + event.getBundle().getSymbolicName());
                break;
            case BundleEvent.STOPPED:
                System.out.println("Bundle stopped: " + event.getBundle().getSymbolicName());
                break;
            case BundleEvent.UPDATED:
                System.out.println("Bundle updated: " + event.getBundle().getSymbolicName());
                break;
            // add more cases as needed
        }
    }
}