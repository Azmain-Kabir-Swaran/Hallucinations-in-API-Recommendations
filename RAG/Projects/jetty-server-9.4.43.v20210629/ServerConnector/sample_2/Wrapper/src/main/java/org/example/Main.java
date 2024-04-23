package org.example;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.bio.SocketConnector;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server();

        SocketConnector connector = new SocketConnector();
        connector.setPort(8080);

        server.addConnector(connector);

        server.setHandler(new HttpEchoHandler());

        server.start();
        server.join();
    }
}