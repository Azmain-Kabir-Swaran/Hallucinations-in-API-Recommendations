package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(server, "/");
        
        // Use ServletHandler API here
        
        server.setHandler(context);
        server.start();
        server.join();
    }
}