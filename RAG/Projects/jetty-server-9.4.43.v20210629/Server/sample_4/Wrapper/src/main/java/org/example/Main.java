package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

public class Main {
    private Server server;

    @Activate
    public void startServer() throws Exception {
        server = new Server(8080);
        server.setHandler(new DefaultHandler());
        server.start();
        server.join();
    }

    public void stopServer() throws Exception {
        server.stop();
    }
}