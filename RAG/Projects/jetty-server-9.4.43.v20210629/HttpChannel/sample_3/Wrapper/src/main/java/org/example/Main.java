package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.gzip.GzipHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.HttpChannel;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a server
        Server server = new Server(8080);

        // Create a GzipHandler to handle compression
        GzipHandler gzip = new GzipHandler();

        // Create a handler for the server
        AbstractHandler handler = new AbstractHandler() {
            @Override
            public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                // Handle the request here
                response.getWriter().println("Hello, World!");
                baseRequest.setHandled(true);
            }
        };

        // Create a collection of handlers
        HandlerCollection handlers = new HandlerCollection();
        handlers.addHandler(gzip);
        handlers.addHandler(handler);

        // Add the handlers to the server
        server.setHandler(handlers);

        // Start the server
        server.start();
        server.join();
    }
}