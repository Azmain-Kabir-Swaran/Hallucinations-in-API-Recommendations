package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import javax.servlet.DispatcherType;
import javax.servlet.http.HttpServletRequest;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(DefaultServlet.class, "/");
        handler.addServlet(HelloWorldServlet.class, "/hello");
        handler.setInitParameter("useFileMappings", "false");
        handler.setInitParameter("welcomeServlets", HelloWorldServlet.class.getName());
        handler.setInitParameter("dirAllowed", "false");
        handler.setInitParameter("listings", "false");

        server.setHandler(handler);

        server.start();
        server.join();
    }
}