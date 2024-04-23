package org.example;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

public class Main {

    public void doSomethingWithBundle(Bundle bundle) throws BundleException {
        bundle.start();
        bundle.update();
        // Perform other operations on the bundle
    }

    public void handleException(BundleException ex) {
        // Handle the exception, potentially log it or report it
    }
}