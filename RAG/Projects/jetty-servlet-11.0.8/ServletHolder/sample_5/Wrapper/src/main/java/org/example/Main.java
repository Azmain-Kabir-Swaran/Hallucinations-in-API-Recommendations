package org.example;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.server.Server;

public class Main extends HttpServlet {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHolder servletHolder = new ServletHolder(new Main());
        server.setHandler(servletHolder);
        server.start();
        server.join();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello World! From Jetty and servlets");
    }
}