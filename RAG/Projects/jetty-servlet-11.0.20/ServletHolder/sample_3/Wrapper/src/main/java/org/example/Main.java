package org.example;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.servlet.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHolder holder = new ServletHolder(new HelloServlet());
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.addServlet(holder, "/*");
        server.setHandler(context);
        server.start();
        server.join();
    }
}