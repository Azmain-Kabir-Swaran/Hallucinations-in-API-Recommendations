package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.server.NCSARequestLog;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirectoriesListed(true);
        resourceHandler.setWelcomeFiles(new String[]{"index.html"});

        ContextHandler context = new ContextHandler();
        context.setContextPath("/");
        context.setHandler(resourceHandler);

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{context});

        server.setHandler(handlers);

        NCSARequestLog requestLog = new NCSARequestLog();
        requestLog.setFilename("logs/yyyy_mm_dd.request.log");
        requestLog.setRetainDays(90);
        requestLog.setAppend(true);
        requestLog.setExtended(true);

        server.setRequestLog(requestLog);

        server.start();
        server.join();
    }
}