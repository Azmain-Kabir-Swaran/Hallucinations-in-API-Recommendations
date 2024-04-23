package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipseervlet.http.HttpServlet;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.server.handler.HandlerList;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletHolder sh = new ServletHolder(HttpServlet.class);
        sh.setInitParameter("hello", "World");
        sh.setInitParameter("message", "Hello Jetty");

        HandlerList handlers = new HandlerList();
        handlers.addHandler(sh);

        server.setHandler(handlers);

        server.start();
        server.join();
    }
}