package org.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;
import java.util.logging.Logger;

public class Main implements BundleActivator, FrameworkListener {
    
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public void start(BundleContext context) {
        context.addFrameworkListener(this);
        logger.info("Started");
    }

    public void stop(BundleContext context) {
        context.removeFrameworkListener(this);
        logger.info("Stopped");
    }

    @Override
    public void frameworkEvent(FrameworkEvent event) {
        switch (event.getType()) {
            case FrameworkEvent.STARTED:
                logger.info("Framework started");
                break;
            case FrameworkEvent.STARTING:
                logger.info("Framework starting");
                break;
            case FrameworkEvent.STOPPED:
                logger.info("Framework stopped");
                break;
            case FrameworkEvent.STOPPING:
                logger.info("Framework stopping");
                break;
        }
    }
}