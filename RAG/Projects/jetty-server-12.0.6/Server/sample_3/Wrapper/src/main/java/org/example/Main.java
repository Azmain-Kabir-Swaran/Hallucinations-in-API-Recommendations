package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipsetter.server.RequestHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080); // Define the server to use port 8080
        server.setHandler(new RequestHandler()); // Define a request handler
        server.start(); // Start the server
        server.join();  // Waits until server is ready to handle requests
    }
}