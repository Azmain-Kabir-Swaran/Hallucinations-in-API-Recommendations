package org.example;


import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkEvent;
import org.osgi.framework.FrameworkListener;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;
import org.osgi.service.log.ServiceLogFactory;
import org.osgi.util.tracker.ServiceTracker;

public class Main implements FrameworkListener, ServiceListener {

  private BundleContext bundleContext;
  private ServiceTracker logServiceTracker;

  public Main(BundleContext bundleContext) {
    this.bundleContext = bundleContext;
    bundleContext.addFrameworkListener(this);
    logServiceTracker = new ServiceTracker(bundleContext, LogService.class.getName(), null);
    logServiceTracker.open();
  }

  @Override
  public void frameworkEvent(FrameworkEvent event) {
    LogService logService = (LogService) logServiceTracker.getService();
    if (logService != null) {
      logService.log(LogService.LOG_INFO, "Framework Event: " + event.getType());
    }
  }

  @Override
  public void serviceChanged(ServiceEvent event) {
    if (event.getType() == ServiceEvent.UNREGISTERING) {
      ServiceReference reference = event.getServiceReference();
      if (reference != null) {
        Bundle bundle = bundleContext.getBundle(reference.getBundle().getBundleId());
        if (bundle != null) {
          bundle.update(Bundle.STARTED);
        }
      }
    }
  }

  public static void main(String[] args) {
    // Start your application, for example:
    BundleContext bundleContext = /* get your bundleContext */;
    Main mainClass = new Main(bundleContext);
  }

}