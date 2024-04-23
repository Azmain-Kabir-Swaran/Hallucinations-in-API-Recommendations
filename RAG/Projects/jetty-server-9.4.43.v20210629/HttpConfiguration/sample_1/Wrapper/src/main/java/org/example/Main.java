package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a Jetty server and define the port it should listen on
        Server server = new Server(8080);
        
        // Define a servlet handler that will process incoming HTTP requests
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        // Define a servlet that sends back "Hello, World!"
        handler.addServletWithMapping(new HttpServlet() {
            protected void doGet(HttpServletRequest request, HttpServletResponse response) {
                try {
                    response.getWriter().println("Hello, World!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "/*");

        // Start the server and make it listen for incoming requests
        server.start();
        server.join();
    }
}