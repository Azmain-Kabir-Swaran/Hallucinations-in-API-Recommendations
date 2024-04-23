package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        handler.addServletWithMapping(HelloWorldServlet.class, "/hello");

        server.start();
        server.join();
    }

}